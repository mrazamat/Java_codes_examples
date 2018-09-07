package uz.coder.collections;

import java.util.Vector;

public class BasicVectorOperations {
    //  Basic Vector Operations
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("First");
        vector.add("Second");
        vector.add("Third");
        System.out.println(vector);
        // adding element at specified index
        vector.add(2,"Random");
        System.out.println(vector);
        // adding element by index
        System.out.println("Element at index 3 is:" + vector.get(3));
        System.out.println("The first element of this vector is: " + vector.firstElement());
        System.out.println("The last element of this vector is: " + vector.lastElement());
        System.out.println("Is this vector empty?: " + vector.isEmpty());
    }
}
