package uz.coder.collections;

import java.util.ArrayList;

public class MyArrayListArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);
        System.out.println("Actual ArrayList: " + al);

        Integer[] intArr = new Integer[al.size()];
        al.toArray(intArr);

        System.out.print("Created Array content: ");
        for (Integer x : intArr){
            System.out.print(x + " ");
        }

    }
}
