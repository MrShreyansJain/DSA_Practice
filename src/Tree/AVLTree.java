package src.Tree;

import java.io.PrintStream;

//this is a self balancing binary tree
public class AVLTree {
    AVLTree(){

    }
    private Node root;
 private class Node{
     private int value ;
     private Node left;
     private Node right;

     private int height=0;
     Node(int value){
         this.value=value;
     }
 }

 public int height(){
     return root.height;
 }

 public int height(Node node){
     if(node==null){
         return -1;
     }
     return node.height;
 }

 public void createAvl(int value){
     root=createAvl(value,root);
 }
 private Node createAvl(int value,Node node){
     if(node==null){
         Node newNode = new Node(value);
         return newNode;
     }
     if(node.value>value){
         node.left=createAvl(value,node.left);
     }else{
         node.right=createAvl(value,node.right);
     }
     node.height= Math.max(height(node.left),height(node.right))+1;
     return rotate(node);
 }

    private Node rotate(Node node) {
     //left heavy case
     if(height(node.left)-height(node.right)>1){
         //left-left
         if(height(node.left.left)-height(node.left.right)>0){
             return rightRotate(node);
         }
         //left-right
         if(height(node.left.left)-height(node.left.right)<0){
             node.left=leftRotate(node);
             return rightRotate(node);
         }
     }

        //right heavy case
        if(height(node.left)-height(node.right)<-1){
            //right-left
            if(height(node.right.left)-height(node.right.right)>0){
                node.right= rightRotate(node);
                return leftRotate(node);
            }
            //right-right
            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }
        }
     return node;
    }

    private Node rightRotate(Node p) {
     Node c=p.left;
     p.left=c.right;
     c.right=p;


     p.height=Math.max(height(p.left),height(p.right))+1;
     c.height=Math.max(height(c.left),height(c.right))+1;
     return c;
    }
    private Node leftRotate(Node p) {
     Node c= p.right;
     p.right=c.left;
     c.left=p;

     p.height=Math.max(height(p.left),height(p.right))+1;
     c.height=Math.max(height(c.left),height(c.right))+1;

     return c;
    }

    public void print(PrintStream os) {
        os.print(traversePreOrder(root));
    }
    public String traversePreOrder(AVLTree.Node root) {

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

    public void traverseNodes(StringBuilder sb, String padding, String pointer, AVLTree.Node node,
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
