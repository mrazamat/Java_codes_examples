package uz.coder.collections.Hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableEntrySet {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Afghanistan", "Kabul");
        ht.put("Albania", " Tirana");
        ht.put("Algeria", "Algiers");
        ht.put("Andorra", " Andorra la Vella");
        ht.put("Angola", "Luanda");
        ht.put("Argentina", "Buenos Aires");
        ht.put("Armenia", "Yerevan");
        System.out.println(ht);

        Set<Entry<String, String>> entires = ht.entrySet();
        for (Entry<String, String> ent : entires) {
            System.out.println(ent.getKey() + " ==> " + ent.getValue());
        }

    }
}
