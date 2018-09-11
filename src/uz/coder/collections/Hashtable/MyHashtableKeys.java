package uz.coder.collections.Hashtable;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableKeys {
    public static void main(String[] args) {
        Hashtable<String, String> hm = new Hashtable<>();
        hm.put("Afghanistan", "Kabul");
        hm.put("Albania", "Tirana");
        hm.put("Algeria", "Algiers");
        hm.put("Andorra", "Andorra la Vella");
        hm.put("Angola", "Luanda");
        hm.put("Argentina", "Buenos Aires");
        hm.put("Armenia", "Yerevan");

        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for (String key : keys)
            System.out.println(key);

    }
}
