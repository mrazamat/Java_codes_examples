package uz.coder.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
//    Description:
//    Here we can see example for reading all elements from ArrayList by using Iterator.
//    Also you can iterate through the ArrayList based on index too.

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Random");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String x:arrayList) {
            System.out.println(x);
        }

    }
}
