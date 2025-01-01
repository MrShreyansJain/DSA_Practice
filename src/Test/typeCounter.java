package src.Test;

public class typeCounter {
    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("7.5"));
        System.out.println(Double.parseDouble("7.5"));
        typeCounter("can you give me 10 buks puff in 7.5 or 7");
    }

    public static void typeCounter(String sentence) {
        String[] arr = sentence.split(" ");
        int sCount = 0;
        int iCount = 0;
        int dCount = 0;
        for (String s : arr) {
            if(!s.isEmpty())
            try {
                //integer check
                if(Integer.parseInt(s)>=0){
                    iCount++;
                }
            }catch (Exception ex){
                try {
                    //Double check
                    if(Double.parseDouble(s)>=0.0d){
                        dCount++;
                    }
                }catch (Exception exs) {
                    sCount++;
                }
            }
        }

        System.out.println("string "+sCount);
        System.out.println("integer "+iCount);
        System.out.println("double "+dCount);

    }
}
/*sdvsdkfb//morecom*/
/*some ******/