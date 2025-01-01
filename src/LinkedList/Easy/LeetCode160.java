package src.LinkedList.Easy;

import src.LinkedList.LL;
import src.LinkedList.ListNode;

import java.util.HashSet;

public class LeetCode160 {
    public static void main(String[] args) {
        ListNode meetNode= new ListNode();
        LL myLL= new LL();
        myLL.insert(5);
        myLL.insert(15);
        myLL.insert(9);
        myLL.insert(3);
        myLL.insert(7);
        myLL.printList();

        ListNode tempHead= myLL.root;
        for (int i = 0; i < 3; i++) {
            tempHead=tempHead.next;
            meetNode=tempHead;
        }

        LL myLL2= new LL();
        myLL.insert(25);
        myLL.insert(30);

        ListNode tempHead2= myLL2.root;
        while(tempHead2!=null){

        }


    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode meetNode= null;

        if(headA==null){
            return null;
        }

        ListNode tempHeadA= headA;
//        HashSet<Integer>



        return  meetNode;
    }

}
