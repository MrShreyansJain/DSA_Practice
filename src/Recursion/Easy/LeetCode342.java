package src.Recursion.Easy;

public class LeetCode342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
    public static boolean isPowerOfFour(int n) {
        double d= n+0.00d;
        return checkPower(n,0);
    }

    private static boolean checkPower(double val,int pow){
        double pVal=Math.pow(4,pow);
        boolean res=false;
        if(pVal>val){
            return false;
        }
        else{
            if(pVal==val){
                return true;
            }else{
                res=checkPower(val,pow+1);
            }
        }
        return res;
    }

}
