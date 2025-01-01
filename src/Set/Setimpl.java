package src.Set;

import java.util.HashSet;
import java.util.Set;

public class Setimpl {
    public static void main(String[] args) {
        Set<Integer> mySet= new HashSet<>();

        mySet.add(5);
        mySet.add(10);
        mySet.add(5);
        System.out.println(mySet);
    }
}
