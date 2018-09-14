// How to get list of all file names from a folder in java?
package uz.coder.JavaIO;

import java.io.File;

public class FileListFromFolder {
    public static void main(String[] args) {
        File file = new File("/home/coder/");
        String[] fileList = file.list();
        for (String name:fileList){
            System.out.println(name);
        }
    }
}
