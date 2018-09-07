package uz.coder.collections;

import java.util.Vector;

public class MyVectorClone {
//    Description:
//    Below example shows how to create exactly same object as available vector object.
//    You can use clone() method to create similar copy of vector.

    public static void main(String[] args) {
        Vector<Character> vector = new Vector<>();
        vector.add('A');
        vector.add('a');
        vector.add('B');
        vector.add('b');
        vector.add('C');
        vector.add('c');
        System.out.println("Actual vector: " + vector);

        Vector<Character> copy = (Vector<Character>)vector.clone();
        System.out.println("Cloned vector: " + copy);
    }
}
