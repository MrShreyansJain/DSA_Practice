package src.Array.Easy;

import java.util.Arrays;

public class LeetCode1929 {
    public static void main(String[] args) {
       int[] nums = {1};
       getConcatenation(nums);
    }
    public static int[] getConcatenation(int[] nums) {
        int [] arr = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
        for(int j= nums.length,m=0;j< arr.length;j++,m++){
            arr[j]=nums[m];
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}
