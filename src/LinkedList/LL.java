package src.LinkedList;

public class LL {
    public ListNode root;
    public ListNode tail;
    public int size;

    public LL(){}

    public LL(ListNode root){
        this.root=root;
    }

    public void insert(int val){
       ListNode tempHead = this.tail;
       ListNode node= new ListNode(val);

       if(tempHead== null){
          tempHead=node;
       }else{
           tempHead.next=node;
           root=tempHead;
       }
        size++;
    }

    public void insertFront(int val){
        ListNode node= new ListNode(val);

        if(this.root==null){
            root=node;
            tail=node;
        }else{
            node.next=root;
            root=node;
        }

    }


    public void insertBehind(int val){
        ListNode tempHead = this.tail;
        ListNode node= new ListNode(val);

        if(tempHead== null){
            tail=node;
            root=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void printList(){
        ListNode tempHead = root;
        while(tempHead!=null){
            System.out.print(tempHead.val+" ");
            tempHead=tempHead.next;
        }
        System.out.println();
    }

    public int size (){return this.size;}
}
