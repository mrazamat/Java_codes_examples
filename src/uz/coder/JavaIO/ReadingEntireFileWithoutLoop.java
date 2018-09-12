// Java Program to illustrate reading from FileReader
// using Scanner Class reading entire File
// without using loop

package uz.coder.JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
