package src.Tree;

import java.io.PrintStream;

public class SegmentTree {
    public Node root;
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int startIndex;
        private int endIndex;

        public Node(int startIndex,int endIndex){
            this.startIndex=startIndex;
            this.endIndex=endIndex;
        }
    }

    public SegmentTree(int[] arr){
        this.root=generateST(arr,0,arr.length-1);
    }
  
    private Node generateST(int[] arr,int start,int end){
        Node node= new Node(start,end);
        if(start==end){
            //leaf node
            node.value=arr[start];
            return node;
        }
        int mid= (start+end)/2;
        node.left=generateST(arr,start,mid);
        node.right=generateST(arr,mid+1,end);
        node.value=node.left.value+node.right.value;
        return node;
    }

    public int query(int start,int end){
        return query(this.root,start,end);
    }

    //find sum in between range
    private int query(Node node,int start,int end){
        //completely coming
        if(node.startIndex>=start&&node.endIndex<=end){
            return node.value;
        }
        //not coming
        else if(node.startIndex>end||node.endIndex<start){
            return 0;
        }
        //partially coming
        else{
            int leftVal=query(node.left,start,end);
            int rightVal=query(node.right,start,end);
            return leftVal+rightVal;
        }
    }

    //update value
    public Node update(int index,int val){
        update(root,index,val);
        return root;
    }
    private int update(Node node,int index,int val){
        //actual index
        if(node.startIndex==index&&node.endIndex==index){
            node.value=val;
            return node.value;
        }
        //inside
        else if (node.startIndex<=index&&node.endIndex>=index) {
            node.value=update(node.left,index,val)+update(node.right,index,val);
            return node.value;
        }
        //not inside
        else {
            return node.value;
        }
    }


    //delete value
    //insert value

    public void print(PrintStream os) {
        os.print(traversePreOrder(root));
    }
    public String traversePreOrder(Node root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.value);

        String pointerRight = "└──";
        String pointerLeft = (root.right != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.left, root.right != null);
        traverseNodes(sb, "", pointerRight, root.right, false);

        return sb.toString();
    }

    public void traverseNodes(StringBuilder sb, String padding, String pointer, Node node,
                              boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.value);

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.right != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
        }
    }



}


