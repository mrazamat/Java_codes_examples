package uz.coder.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayListSort {

// How to sort ArrayList using Comparator?
// This example gives you how to sort an ArrayList using Comparator.
// The ArrayList contains user defined objects.
// By using Collections.sort() method you can sort the ArrayList.
// You have to pass Comparator object which contains your sort logic.
// The example sorts the Empl objects based on highest salary.

    public static void main(String[] args) {
        List<Empl> list = new ArrayList<>();
        list.add(new Empl("Guli", 3000));
        list.add(new Empl("Nafisa", 6000));
        list.add(new Empl("Shaxzoda", 2000));
        list.add(new Empl("Malika", 2400));
        Collections.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for (Empl e : list)
            System.out.println(e);
    }

    static class MySalaryComp implements Comparator<Empl> {

        @Override
        public int compare(Empl o1, Empl o2) {
            if (o1.getSalary() < o2.getSalary()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static class Empl {
        private String name;
        private int salary;

        public Empl(String n, int s) {
            this.name = n;
            this.salary = s;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Name: " + this.name + "--Salary: " + this.salary;
        }
    }
}
