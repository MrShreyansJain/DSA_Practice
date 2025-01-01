package src.Tree;

public class treeImpl {
    public static void main(String[] args) {
        SelfBinaryTree sbt= new SelfBinaryTree();

       // sbt.insert();

        BinarySearchTree bst= new BinarySearchTree();
        int[] som= {15,10,20,5,8};

        for (int i: som) {
          //  bst.insert(i);
        }
//        System.out.println(sumBetweenIndex(som,1,4));
//        System.out.println((2+3)/2);


//        SegmentTree st= new SegmentTree(new int[]{3,8,7,6,-2,-8,4,9});
//        System.out.println(st.query(2,6));
//        st.print(System.out);
//        System.out.println(" ");
//        st.update(2,5);
//        st.print(System.out);

//        AVLTree avlTree= new AVLTree();
//        int [] arr= {3,8,7,6,-2,-8,4,9};
//        for (int i: arr) {
//            avlTree.createAvl(i);
//        }
//        avlTree.print(System.out);

        AVLTree avlTree= new AVLTree();
        for (int i = 0; i < 1000; i++) {
            avlTree.createAvl(i);
        }
        System.out.println(avlTree.height());
    }


}
