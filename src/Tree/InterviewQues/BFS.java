package src.Tree.InterviewQues;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BFS {
    public static void main(String[] args) {
        double a=10/3;
        BigDecimal num = new BigDecimal(10);
        BigDecimal den = new BigDecimal(3);

        BigDecimal result = num.divide(den, 5, RoundingMode.HALF_UP);
        System.out.println(result);
    }
}
