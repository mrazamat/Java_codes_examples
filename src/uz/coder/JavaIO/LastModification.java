// How to get last modification date of a file ?
//
//Solution
//This example shows how to get the last modification date of a file using file.lastModified() method of File class.
package uz.coder.JavaIO;

import java.io.File;
import java.util.Date;

public class LastModification {
    public static void main(String[] args) {
        File file = new File("tests.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
