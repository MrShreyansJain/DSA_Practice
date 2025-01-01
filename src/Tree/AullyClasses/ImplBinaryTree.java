package src.Tree.AullyClasses;

import java.util.*;

public class ImplBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] bk= new String[n];
        ArrayList<String> sortls= new ArrayList<>();

        HashMap<String,String> hs= new HashMap<>();
        for (int i = 0; i < n; i++) {
                String[] st= sc.nextLine().split(",");
                //System.out.println(Arrays.toString(st));
                sortls.add(st[2]);
                hs.put(st[0],st[2]);
        }
        Collections.sort(sortls);
        for (String s:sortls) {
            if(hs.containsValue(s)){
                for (String k: hs.keySet()) {
                    if(hs.get(k)==s){
                        System.out.println(k);
                        hs.remove(k);
                    }
                }
            }
        }


       // sortBooks(hs);
    }
    public static Set<String> sortBooks(HashMap<String,String> hs){

        // TreeMap to store values of HashMap
        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(hs);
        for (Map.Entry<String, String> entry :
                sorted.entrySet()){
            System.out.println(entry.getKey());
        }

        return hs.keySet();
    }

}
