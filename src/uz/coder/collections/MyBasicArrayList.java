package uz.coder.collections;

import java.util.ArrayList;

public class MyBasicArrayList {
    //    Description:
//    Here we can see example for basic ArrayList operations like creating object for ArrayList,
//    adding objects into ArrayList, accessing objects based on index,
//    searching an object in ArrayList whether it is listed under this instance or not,
//    adding elements at specific index, checking whether the ArrayList is empty or not,
//    getting object index, and finally size of the ArrayList.
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("C++");
        al.add("PERL");
        al.add("PHP");
        System.out.println(al);
        System.out.println("Element at index 1: " + al.get(1));
        System.out.println("Does list contains Java?: " + al.contains("Java"));
        System.out.println("Does list contains JAVA?: " + al.contains("JAVA"));
        al.add(2, "JavaScript");
        System.out.println(al);
        System.out.println("Is arraylist empty? " + al.isEmpty());
        System.out.println("Size of the arraylist " + al.size());


    }
}
