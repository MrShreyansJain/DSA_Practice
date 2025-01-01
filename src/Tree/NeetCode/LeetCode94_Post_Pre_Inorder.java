package src.Tree.NeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94_Post_Pre_Inorder {
    public static void main(String[] args) {
        int [] arr= {4,2,7,1,3,5};
        TreeNode myTree=TreeNode.creteTree(arr);
        System.out.println(inorderTreversalTreeList(myTree));
    }
    public static List<Integer> inorderTreversalTreeList(TreeNode node){
        List<Integer> list= new ArrayList<>();
        list=inorderTrivarsal(node,list);
        return  list;
    }

    private static List<Integer> inorderTrivarsal(TreeNode node,List<Integer> list){
        if(node == null){
            return list;
        }else{
            
//            list.add(node.val);    //preorder(print root node Rot->Lef->Rig)
            list=inorderTrivarsal(node.left,list);
//            list.add(node.val);    //inorder(preorder(print root node Lef->Rot->Rig))
            list=inorderTrivarsal(node.right,list);
            list.add(node.val);      //postorder(preorder(print root node Lef->Rig->Rot))

        }
        return list;
    }
}
