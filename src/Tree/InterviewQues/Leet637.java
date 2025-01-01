package src.Tree.InterviewQues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> myQue= new LinkedList<>();
        myQue.offer(root);
        while(myQue.isEmpty()){
            int levelSize= myQue.size();
            double average= 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode=myQue.poll();
                average+=currentNode.val;
                if (currentNode.left!=null){
                    myQue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    myQue.offer(currentNode.right);
                }
            }
average=average/levelSize;
            ans.add(average);
        }
        return ans;
    }
}
