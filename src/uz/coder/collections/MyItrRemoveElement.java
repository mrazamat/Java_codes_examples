package uz.coder.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyItrRemoveElement {

//    Description:
//    Below example shows how to remove an element from collection object using Iterator object.
//    The remove() method removes from the underlying collection the last element returned by the iterator

    public static void main(String[] args) {
        String removeElement = "Perl";
        List<String> myList = new LinkedList<>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Linux");
        myList.add("PHP");
        myList.add("Perl");
        myList.add("PHP");
        myList.add("Ruby");
        System.out.println("Before remove: ");
        Iterator<String> iterator = myList.iterator();
        System.out.println(myList);
        while (iterator.hasNext()){
            if (removeElement.equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println("After remove");
        System.out.println(myList);

    }
}
