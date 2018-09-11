// Java Program to illustrate reading from
// FileReader using FileReader
package uz.coder.JavaIO;

import java.io.FileReader;

public class ReadingFromFile2 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("test.txt");

        int i;
        while ((i=fr.read()) != -1)
            System.out.print((char) i);

    }
}
