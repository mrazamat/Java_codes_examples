package uz.coder.JavaIO;

import java.io.File;
import java.text.SimpleDateFormat;

public class GetFileLastModifiedExample {
    public static void main(String[] args) {
        File file = new File("tests.txt");
        System.out.println("Before format: " + file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("After Format: " + sdf.format(file.lastModified()));

    }
}
