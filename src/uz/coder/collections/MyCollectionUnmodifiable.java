// Problem Description
// How to make a collection read-only ?
//
// Solution:
//   Following example shows how to make a collection read-only
//   by using Collections.unmodifiableList() method of Collection class.

package uz.coder.collections;

import java.util.*;

public class MyCollectionUnmodifiable {
    public static void main(String[] args) {
        List stuff = Arrays.asList(new String[]{"alpha","beta","gamma"});
        List list = new ArrayList(stuff);
        list= Collections.unmodifiableList(list);

        try{
            list.set(0,"new value");
        } catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map=Collections.unmodifiableMap(map);
        System.out.println("Collection is read-only now.");

    }
}
