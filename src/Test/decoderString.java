package src.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class decoderString {
    public static void main(String[] args) {
        String msg = decryptMessage("world hel2o");
        System.out.println(msg);
    }

    public static String decryptMessage(String encryptedMessage) {
        String msg = "";
        String[] words = encryptedMessage.split(" ");
        String[] newWords = new String[words.length];
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('0');
        arr.add('1');
        arr.add('2');
        arr.add('3');
        arr.add('4');
        arr.add('5');
        arr.add('6');
        arr.add('7');
        arr.add('8');
        arr.add('9');


        for (int m = 0; m < words.length; m++) {
            char[] myChar = words[m].toCharArray();
            String newS = "";
            for (int i = 0; i < myChar.length; i++) {
                if (arr.contains(myChar[i])) {
                    String mod = "";
                    for (int j = 1; j < Integer.parseInt(myChar[i] + ""); j++) {
                        mod += myChar[i - 1];
                    }
                    newS += mod;
                } else {
                    newS += myChar[i];
                }
            }
            newWords[m] = newS;
        }
        for (int i = newWords.length - 1; i >= 0; i--) {
            if (!newWords[i].isEmpty()) {
                msg += newWords[i] + " ";

            }
        }

        return msg.trim();
    }
}
