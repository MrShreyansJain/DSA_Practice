package src.Tree;

import java.util.Scanner;

class SelfBinaryTree {
    private Node root;
    public SelfBinaryTree(){

    }
    private static class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value=value;
    }
 }

 //insert elements
public void  insert(){
    System.out.println("Kindly Provide node value:- ");
    Scanner sc= new Scanner(System.in);
    int value = sc.nextInt();
    Node node= new Node(value);
    root= node;
    insert(sc,node);
    System.out.println(root);
}
private void insert(Scanner sc,Node parentNode){
  boolean left=false;
  boolean right=false;
    System.out.println("Do you want to insert left of "+parentNode.value);
    left=sc.nextBoolean();
    if(left){
        System.out.println("provide value for insertion:- ");
        int val = sc.nextInt();
        Node childNode=new Node(val);
        parentNode.left=childNode;
        insert(sc,childNode);
    }
    System.out.println("Do you want to insert right of "+parentNode.value);
    right=sc.nextBoolean();
    if(right){
        System.out.println("provide value for insertion:- ");
        int val = sc.nextInt();
        Node childNode=new Node(val);
        parentNode.right=childNode;
        insert(sc,childNode);
    }
}

}
