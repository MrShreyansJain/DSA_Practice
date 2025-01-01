package src.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Mysum {
    public static void main(String[] args) {
      Mysum obj= new Mysum();
//      Integer [] arr= {1,2,3,4,5};
//      String [] sarr={""};
//        System.out.println(obj.sum(arr));
//        System.out.println(obj.sum(sarr));

        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        //System.out.println(s);

        String[] input=s.split(" ");

        try{
           if(Integer.parseInt(input[0])>=0){
               Integer[] ints= new Integer[input.length];
               for (int i=0;i< input.length;i++) {
                   ints[i]=Integer.parseInt(input[i]);
               }
               //System.out.println(Arrays.toString(ints));
               int tot=obj.sum(ints);
               System.out.println(tot);
           }
        }catch (Exception ex){
            String stot= obj.sum(input);
            System.out.println(stot);
        }




    }
    public Integer sum(Integer[] ints){
        Integer sumVal= 0;
        for(int i:ints){
           sumVal+=i;
        }
        return sumVal;
    }
    public String sum(String[] ints){
        StringBuilder sb=new StringBuilder();
        for(String s:ints){
            sb.append(s);
        }
        return sb.toString();
    }
}
