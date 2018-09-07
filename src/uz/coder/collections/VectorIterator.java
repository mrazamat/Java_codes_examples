package uz.coder.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {
//    Description:
//    Below example shows how to iterate through vector using iterator object.
//    You can get iterator object by calling iterator() method.

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        Iterator<Integer>iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
