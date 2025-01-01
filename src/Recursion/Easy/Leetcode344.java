package src.Recursion.Easy;

public class Leetcode344 {
    public static void main(String[] args) {
        char[] sh= {};
        reverseString(sh);
    }

    public static void reverseString(char[] s) {
       myReverse(s,0,s.length-1);
    }

    private static char[] myReverse(char[] s,int start,int end){
        if(start>end){
            return s;
        }
        //swapping value
        char temp= s[start];
        s[start]=s[end];
        s[end]=temp;

        myReverse(s,start+1,end-1);

        return s;
    }



}
