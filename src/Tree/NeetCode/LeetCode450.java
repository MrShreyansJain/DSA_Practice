package src.Tree.NeetCode;

public class LeetCode450 {
    public static void main(String[] args) {
        int [] arr= {5,3,6,2,4,7};
        TreeNode myTree=TreeNode.creteTree(arr);
        TreeNode modTree= TreeNode.deleteNode(myTree,3);

        System.out.println(modTree);
    }
}
