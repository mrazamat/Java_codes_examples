package uz.coder.collections;

import java.util.Vector;

public class MyVectorArrayCopy {
//    Description:
//    You can copy all elements of a vector object to an array.
//    By passing an array object to copyInto() method,
//    you can copy content of a vector object to an array.

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Andi");
        vector.add("Tarkan");
        vector.add("Arash");
        vector.add("Avram");
        System.out.println("Actual vector: " + vector);

        String[] arr = new String[vector.size()];
        vector.copyInto(arr);
        System.out.println("Copied Array content: ");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
