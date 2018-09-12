package uz.coder.collections.HashSet;

import java.util.HashSet;

public class MyBasicHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty?: " + hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of HashSet?: " + hs.size());
        System.out.println("Does HashSet contains first elements? " +hs.contains("first"));


    }
}
