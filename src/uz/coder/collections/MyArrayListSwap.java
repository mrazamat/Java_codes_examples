package uz.coder.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Book");
        list.add("Window");
        list.add("Android");
        list.add("iOS");
        list.add("Linux");
        list.add("Unix");
        list.add("Mac");

        System.out.println("Results before swap operation: " + list);
        Collections.swap(list,2,5);
        System.out.println("Results after swap operation: " + list);
    }
}
