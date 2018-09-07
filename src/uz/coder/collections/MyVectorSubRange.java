package uz.coder.collections;

import java.util.List;
import java.util.Vector;

public class MyVectorSubRange {
    //    Description:
//    You can copy a range of vector content.
//    The method subList() helps us to get sub range from the given vector object.
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("one");
        vector.add("two");
        vector.add("three");
        vector.add("four");
        vector.add("five");
        System.out.println("Actual vector: " + vector);
        List<String> list = vector.subList(2, 4);
        System.out.println("Sub list: " + list);
    }
}
