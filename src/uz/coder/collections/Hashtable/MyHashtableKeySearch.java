package uz.coder.collections.Hashtable;

import java.util.Hashtable;

public class MyHashtableKeySearch {
    public static void main(String[] args) {
        Hashtable<String,String> hm = new Hashtable<>();
        hm.put("Moscow","Russia");
        hm.put("Rome","Italy");
        hm.put("Tokyo","Japan");
        System.out.println(hm);

        if (hm.containsKey("Rome")){
            System.out.println("The Hashtable contains key 'Rome'");
        } else {
            System.out.println("The Hashtable does not contains key 'Rome'");
        }
        if (hm.containsKey("Baku")){
            System.out.println("The Hashtable contains key 'Baku'");
        } else {
            System.out.println("The Hashtable does not contains key 'Baku'");
        }

        System.out.println("-------------------------------------------");
        System.out.println(hm);
        // Search a value in Hashtable
        if (hm.containsValue("Russia")){
            System.out.println("The Hashtable contains key 'Russia'");
        } else {
            System.out.println("The Hashtable does not contains key 'Russia'");
        }
        if (hm.containsValue("Livan")){
            System.out.println("The Hashtable contains key 'Livan'");
        } else {
            System.out.println("The Hashtable does not contains key 'Livan'");
        }
    }

}
