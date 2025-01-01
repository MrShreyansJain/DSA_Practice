package src.Tree.NeetCode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode700 {
    public static void main(String[] args) {
        int [] arr= {4,2,7,1,3,5};
        TreeNode myTree=TreeNode.creteTree(arr);
        TreeNode newTree=searchBST(myTree,2);

//        System.out.println(newTree);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
         if (root == null ) {
            return root;
        } else if (val > root.val){
            return searchBST(root.right,val);
        }else if(val < root.val){
            return searchBST(root.left,val);
        } else{
            return  root;
        }
    }



}
