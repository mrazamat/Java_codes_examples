package uz.coder.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionIterator {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Linux");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        myList.add("PHP");
        Iterator<String> iterator = myList.iterator();
        System.out.println("\nby while:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nby foreach:");
        for (String x:myList) {
            System.out.println(x);
        }
    }

}
