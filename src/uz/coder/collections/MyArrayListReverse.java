package uz.coder.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Astraxan");
        list.add("Moscow");
        list.add("Paris");
        list.add("Oslo");
        list.add("Glass");
        Collections.reverse(list);
        System.out.println("Results after reverse operation: ");
        for (String str : list) {
            System.out.println(str);
        }
    }

}
