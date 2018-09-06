package uz.coder.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
    //    Description:
//    Using ListIterator, we can iterate all elements of a list in either direction.
//    You can access next element by calling next() method, and also you can access previous
//    element by calling previous() method on the list.
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        litr = li.listIterator();
        System.out.println("Elements in forward direction");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward direction");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
