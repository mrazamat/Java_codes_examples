package uz.coder.collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {
    // Here we can see example for copying another collection instance objects to existing ArrayList.
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("One");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");
        System.out.println("Actual ArrayList: " + al);
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        al.addAll(list);
        System.out.println("After Copy: " + al);
    }

}
