package uz.coder.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MyBasicOperations {
    //Description:
    // Here we can see example for basic operations like creating object for LinkedList,
    // adding objects into LinkedList, searching an object in LinkedList, whether it is
    // listed under this LinkedList instance or not, checking whether the LinkedList is
    // empty or not, and finally size of the LinkedList.

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grape");
        list.add("Banana");
        System.out.println(list);

        // Read all elements in LinkedList by using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Basic operations
        System.out.println("Size of the linked list: " + list.size());
        System.out.println("Is LinkedList empty?: " + list.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'?: " + list.contains("Grape"));
        // Copy or clone a LinkedList
        LinkedList<String> copy = (LinkedList<String>) list.clone();
        System.out.println("Cloned Linkedlist: " + copy);
    }
}
