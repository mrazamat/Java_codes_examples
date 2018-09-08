package uz.coder.collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("123");
        arr.add("234");
        arr.add("345");
        arr.add("456");
        arr.add("567");

        System.out.println("Actual ArrayList: " + arr);
        List<String> list=arr.subList(0,1);
        System.out.println("Sub List: " + list);

    }
}
