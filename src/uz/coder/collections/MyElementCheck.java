package uz.coder.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyElementCheck {
//    Description:
//    Below example shows how to find whether a vector contains list of objects or not.
//    The method containsAll() helps us to find the match.

    public static void main(String[] args) {
        Vector<String> vct = new Vector<>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        List<String> list = new ArrayList<>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does vector contains all list elements?: " + vct.containsAll(list));
        list.add("one");
        System.out.println("Does vector contains all list elements?: " + vct.containsAll(list));


    }
}
