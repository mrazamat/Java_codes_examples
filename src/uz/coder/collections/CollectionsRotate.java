//How to rotate elements of the List ?
//
//Solution:
//Following example uses rotate() method to rotate elements of the list
// depending on the 2nd argument of the method.

package uz.coder.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotate {
    public static void main(String[] args) {
        List list = Arrays.asList("one two three four five six".split(" "));
        System.out.println("List: " + list);
        Collections.rotate(list,4);
        System.out.println("Rotate: " + list);
    }
}
