package uz.coder.collections;

import java.util.ArrayList;

public class ClearMyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println("Actual ArrayList: " +al);
        al.clear();
        System.out.println("After clear ArrayList" + al);
    }
}
