package src.Tree.NeetCode;
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      public static TreeNode creteTree(int[] arr){
          TreeNode myNode= null;
          for(int i:arr){
              if(myNode ==null){
                  myNode= new TreeNode(i);
              }else{
                  myNode=creteTreeNodes(i,myNode);
              }

          }
          return myNode;
      }

      private static TreeNode creteTreeNodes(int val,TreeNode node){
          TreeNode newNode= new TreeNode(val);
          if(node == null){
              return newNode;
          }else if (newNode.val< node.val){
              node.left= creteTreeNodes(val,node.left);
          }else if (newNode.val> node.val){
              node.right= creteTreeNodes(val,node.right);
          }else{

          }
          return node;
      }

      public static TreeNode deleteNode(TreeNode node,int val){
          if(node ==null){
              return node;
          }else if(val>node.val){
              node.right=deleteNode(node.right,val);
          }else if(val<node.val){
              node.left=deleteNode(node.left,val);
          }else{
              //if the node is leaf node
              if(node.left==null && node.right == null){
                  return null;
              }
              //if either right has value or left has value
              else if(node.left ==null && node.right !=null){
                  return node.right;
              }
              else if(node.left !=null && node.right ==null){
                  return node.left;
              }

              //both the branches has value
              else{
                  TreeNode newNode= findLeftMostOfSubTree(node.right);
                  node.val= newNode.val;

                  node.right=deleteNode( node.right,newNode.val);
              }
          }

          return node;
      }

      private static TreeNode findLeftMostOfSubTree(TreeNode node){
          while(node.left!=null){
              node=node.left;
          }
          return node;
      }
  }
