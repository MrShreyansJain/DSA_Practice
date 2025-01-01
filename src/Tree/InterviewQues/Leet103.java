package src.Tree.InterviewQues;

import java.util.*;

public class Leet103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        boolean rev=false;
        Deque<TreeNode> myQue= new LinkedList<>();
        myQue.offer(root);
        while(!myQue.isEmpty()){
            int levelSize= myQue.size();
            List<Integer> curList= new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {

                if(!rev){
                    TreeNode currentNode=myQue.pollFirst();
                    curList.add(currentNode.val);
                    if(currentNode.right!=null){
                        myQue.offerLast(currentNode.right);
                    }
                    if (currentNode.left!=null){
                        myQue.offerLast(currentNode.left);
                    }
                }
                else{
                    TreeNode currentNode=myQue.pollLast();
                    curList.add(currentNode.val);
                    if (currentNode.left!=null){
                        myQue.offerFirst(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        myQue.offerFirst(currentNode.right);
                    }
                }
            }
            ans.add(curList);
            rev=!rev;
        }
        return ans;
    }
}
