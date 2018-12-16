package uz.coder.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // create ArrayList
        List<Integer> list = new ArrayList<>();

        // add elements
        for (int i = 0; i <=100; i++) {
            list.add(i);
        }

        // get element
        System.out.println(list.get(0));
        System.out.println(list.get(100));

        // remove

        list.remove(5);

        // show all
        for (int x : list){
            System.out.println(x);
        }


    }
}
