package uz.coder.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListClone {
    //    Here we can see example for creating duplicate object of an ArrayList instance.
    //    We can done this by using clone() function.
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(8);
        al.add(7);
        al.add(6);
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        ArrayList<Integer> al2 = new ArrayList<>(al);
        System.out.println(al2);
        ArrayList<Integer> al3 = (ArrayList<Integer>) al.clone();
        System.out.println("Cloned ArrayList: " + al3);
    }
}
