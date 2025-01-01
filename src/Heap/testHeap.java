package src.Heap;

public class testHeap {
    public static void main(String[] args) throws Exception{
        SelfHeap<Integer> myheap= new SelfHeap<>();
        myheap.insert(34);
        myheap.insert(22);
        myheap.insert(48);
        myheap.insert(11);


        System.out.println(myheap.heapSort());
    }

}
