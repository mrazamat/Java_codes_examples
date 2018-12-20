package uz.coder.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static void main(String[] args) {
        Person person = new Person("Azamat", 30, Arrays.asList("Samarkand","Tashkent","Moscow","Berlin"));
        String json=GSON.toJson(person);
        System.out.println(json);

        GSON.toString()
    }
}

class Person {
    private String name;
    private Integer age;
    private List<String> geoHistory = new ArrayList<>();

    public Person(String name, Integer age, List<String> geoHistory) {
        this.name = name;
        this.age = age;
        this.geoHistory = geoHistory;
    }
}
