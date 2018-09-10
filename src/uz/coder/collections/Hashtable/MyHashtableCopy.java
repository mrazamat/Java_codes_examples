package uz.coder.collections.Hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class MyHashtableCopy {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<>();
        hm.put(1, "FIRST INSERTED");
        hm.put(2, "SECOND INSERTED");
        hm.put(3,"THIRD INSERTED");
        System.out.println(hm);

        HashMap<Integer,String>subMap = new HashMap<>();
        subMap.put(4,"FOUR INSERTED");
        subMap.put(5,"FIVE INSERTED");
        hm.putAll(subMap);

        System.out.println(hm);

    }
}
