package src.Tree.InterviewQues;


import java.util.*;

/**
 * Definition for a binary tree node.**/



public class Leet102 {

    public static void main(String[] args) {
        TreeNode tr= new TreeNode(1);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> myQue= new LinkedList<>();
        myQue.offer(root);
        while(myQue.isEmpty()){
            int levelSize= myQue.size();
            List<Integer> curList= new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode=myQue.poll();
                curList.add(currentNode.val);
                if (currentNode.left!=null){
                    myQue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    myQue.offer(currentNode.right);
                }
            }
            ans.add(curList);
        }
        return ans;


    }
}
