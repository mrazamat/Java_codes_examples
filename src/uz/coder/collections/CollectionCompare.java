//Problem Description
//How to compare elements in a collection ?
//
//Solution
//Following example compares the element of a collection by converting a string
// into a treeset using Collection.min() and Collection.max() methods of Collection class.
package uz.coder.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CollectionCompare {
    public static void main(String[] args) {
        String[] coins = {"Penny", "nickel", "dime", "Quarter", "dollar"};
        Set set = new TreeSet();

        for (int i = 0; i < coins.length; i++) {
            set.add(coins[i]);
        }
        System.out.println("All set data:");
        System.out.println(set);
        System.out.println("Min:" + Collections.min(set));
        System.out.println("Min with CASE_INSENSIVE_ORDER: " + Collections.min(set, String.CASE_INSENSITIVE_ORDER));

        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Max:" + Collections.max(set));
        System.out.println("Max with CASE_INSENSIVE_ORDER: " + Collections.max(set, String.CASE_INSENSITIVE_ORDER));


    }

}
