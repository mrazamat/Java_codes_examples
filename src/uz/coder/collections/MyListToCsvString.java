package uz.coder.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListToCsvString {
    //This example shows how to convert given list of strings to comma seperated values (csv) format.
    public String getListAsCsvString(List<String> list){

        StringBuilder sb = new StringBuilder();
        for (String str:list) {
            if (sb.length()!=0){
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("animal");
        list1.add("nuts");
        list1.add("java");

        MyListToCsvString mtc = new MyListToCsvString();
        System.out.println(mtc.getListAsCsvString(list1));

        List<String> intList=new LinkedList<>();
        intList.add("2");
        intList.add("4");
        intList.add("16");
        intList.add("32");
        intList.add("64");
        System.out.println(mtc.getListAsCsvString(intList));

    }
}
