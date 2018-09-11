// Java program to illustrate reading data from file
// using nio.File
package uz.coder.JavaIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {
    public static void main(String[] args) {
        List list = readFileInList("test.txt");
        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    private static List<String> readFileInList(String fileName) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
