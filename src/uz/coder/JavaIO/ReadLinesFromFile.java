package uz.coder.JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinesFromFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader(new FileReader("tests.txt"));
            while ((strLine=br.readLine())!=null){
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.err.println("Unable to read the file: fileName");
        }
    }
}
