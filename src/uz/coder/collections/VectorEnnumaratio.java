package uz.coder.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnnumaratio {
//    Description:
//    Below example shows how to iterate through vector using Enumeration object.
//    You can get Enumeration object by calling elements() method.

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("two");
        vector.add("third");
        vector.add("four");
        Enumeration<String> enm = vector.elements();
        while (enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}
