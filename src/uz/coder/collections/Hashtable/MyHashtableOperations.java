package uz.coder.collections.Hashtable;

import java.util.Hashtable;

public class MyHashtableOperations {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "First inserted");
        ht.put("second", "Second inserted");
        ht.put("third", "Third inserted");
        System.out.println(ht);
        System.out.println("Value of key 'second': " + ht.get("second"));
        System.out.println("Is HashTable empty? " + ht.isEmpty());
        ht.remove("third");
        System.out.println("Size of HashTable " + ht.size());
    }
}
