package src.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class decimalformater {
    public static void main(String[] args) {

        DecimalFormat ds= new DecimalFormat("0.000000");
        ds.setRoundingMode(RoundingMode.CEILING);
       // System.out.println(ds.format(d));
    }
//    public static void plusMinus(List<Integer> arr) {
//        // Write your code here
//
//    }
}
