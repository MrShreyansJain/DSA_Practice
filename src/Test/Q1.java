package src.Test;

interface Bi {
    void method();
}

 abstract class Bc implements Bi{

}


public class Q1 {
    public static void main(String[] args) {
//        (new Q1()).method();
        Float f= new Float("3.0");
        int i= f.intValue();
        byte b= f.byteValue();
        double d= f.doubleValue();
        System.out.println(i+b+d);
    }

}
