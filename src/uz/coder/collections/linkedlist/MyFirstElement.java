package uz.coder.collections.linkedlist;

import java.util.LinkedList;

public class MyFirstElement {
    public static void main(String[] args) {
        LinkedList<String> arrl = new LinkedList<>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
//        System.out.println("First Element: "+arrl.element());
//        System.out.println("First Element: "+arrl.getFirst());
//        System.out.println("First Element: "+arrl.peek());
        System.out.println("First Element: "+arrl.peekFirst());

    }
}
