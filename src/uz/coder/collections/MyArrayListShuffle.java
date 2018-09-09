package uz.coder.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShuffle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        System.out.println("Active ArrayList: " + list);


        Collections.shuffle(list);
        System.out.println("Results after shuffle operation: " + list);

        Collections.shuffle(list);
        System.out.println("Results after shuffle operation: " + list);
    }
}
