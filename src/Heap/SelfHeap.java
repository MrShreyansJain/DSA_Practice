package src.Heap;

import java.util.ArrayList;
import java.util.Comparator;

class SelfHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public SelfHeap(){
        list= new ArrayList<T>();
    }

    private void swap(int indexL,int indexR){
        T temp= list.get(indexL);
        list.set(indexL, list.get(indexR));
        list.set(indexR, temp);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return index*2+1;
    }

    private int right(int index){
        return index*2+2;
    }

    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int p=parent(index);
        if(list.get(p).compareTo(list.get(index))>0){
            swap(p,index);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("the lISt is empty");
        }
        T temp = list.get(0);
        T last= list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min=index;
        int left= left(index);
        int right= right(index);

        if(left< list.size()&&list.get(min).compareTo(list.get(left))>0){
            min=left;
        }
        if(right< list.size()&&list.get(min).compareTo(list.get(right))>0){
            min=left;
        }

        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }


    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> arr= new ArrayList<>();

        while(!list.isEmpty()){
            arr.add(this.remove());
        }
        return arr;
    }



}
