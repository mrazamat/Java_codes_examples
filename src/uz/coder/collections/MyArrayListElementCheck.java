package uz.coder.collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListElementCheck {
    //Here we can see example for finding whether the instance of an ArrayList contains all objects of another Collection instance.
    // Here we are checking with another List instance.
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Windows");
        al.add("Unix");
        al.add("FreeBSD");

        List<String> list = new ArrayList<>();
        list.add("Unix");
        list.add("FreeBSD");
        System.out.println("Does ArrayList contains all list elements?: " + al.containsAll(list));
        list.add("Macintosh");
        list.add("Linux");
        System.out.println("Does ArrayList contains all list elements?: " + al.containsAll(list));
    }
}
