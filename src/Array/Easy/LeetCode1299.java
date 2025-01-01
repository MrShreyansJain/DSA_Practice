package src.Array.Easy;

import java.util.Arrays;

public class LeetCode1299 {
    public static void main(String[] args) {
        int [] arr = {17};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static  int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i!= arr.length-1){
                int maxVal=findMax(arr,i+1);
                arr[i]=maxVal;
            }else {
                arr[i]=-1;
            }

        }
      return arr;
    }

    public static int findMax(int[] arr,int sInd){
        int max= 0;
        for (int i = sInd; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
