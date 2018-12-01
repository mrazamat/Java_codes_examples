package uz.coder.java;
import javax.swing.*;
import java.util.Calendar;
public class UsingVar {
    public static void main(String[] args) {
        String name = "Mister Razakov";
        int bornYear = 1989;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear-bornYear;
        char category = 'B';
        String text = "Driver: " + name;
        text = text + "\n age: " + age;
        text = text + "\n Category: " + category;
        JOptionPane.showMessageDialog(null,text);
    }
}
