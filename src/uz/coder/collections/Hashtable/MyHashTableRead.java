package uz.coder.collections.Hashtable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashTableRead {
    public static void main(String[] args) {
        Hashtable<String, String> hm = new Hashtable<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);

        Set<String> keys = hm.keySet();
        for (String key:keys) {
            System.out.println("Value of " + key + " is: " + hm.get(key));
        }
    }
}
