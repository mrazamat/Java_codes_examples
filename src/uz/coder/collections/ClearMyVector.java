package uz.coder.collections;

import java.util.Vector;

public class ClearMyVector {
//    Description:
//    Below example shows how to remove all elements from vector at once.
//    You can call clear() method to delete all elements of a vector at one call.
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Actual vector: " + vector);
        vector.clear();
        System.out.println("After clear vector: " + vector);
    }

}
