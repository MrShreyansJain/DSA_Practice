package src.LinkedList.Easy;

import src.LinkedList.LL;
import src.LinkedList.ListNode;

public class LeetCode21 {
    public static void main(String[] args) {

        LL myLL = new LL();
        myLL.insertBehind(1);
        myLL.insertBehind(2);
        myLL.insertBehind(4);

        LL myLL2 = new LL();
        myLL2.insertBehind(1);
        myLL2.insertBehind(3);
        myLL2.insertBehind(4);


        myLL.printList();
        myLL2.printList();

        LL result = new LL(mergeTwoLists(myLL.root, myLL2.root));

        result.printList();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        }
        return list1;

    }

}
