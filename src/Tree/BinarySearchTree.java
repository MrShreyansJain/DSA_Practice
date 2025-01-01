package src.Tree;

import java.util.Scanner;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){

    }
    public class Node{
        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node (int value){
            this.value=value;
        }
    }

    public int height(Node node){
        if(root==null){
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
        root =insert(value,root);
    }
    private Node insert(int value,Node node){

        if(node==null){
            Node tnode=new Node(value);
            return tnode;
        }

        if(value< node.value){
            node.left= insert(value,node.left);
        }
        if(value> node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(node.left.height,node.right.height)+1;
        return node;
    }


}
