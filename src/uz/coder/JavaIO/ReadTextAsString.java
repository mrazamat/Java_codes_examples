// Java Program to illustrate reading from text file
// as string in Java
package uz.coder.JavaIO;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextAsString {
    public static void main(String[] args) throws Exception{
        String data = readFileAsString("test.txt");
        System.out.println(data);
    }
    private static String readFileAsString(String fileName) throws Exception{
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
}
