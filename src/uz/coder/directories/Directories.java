//Following example shows how to create directories recursively with the help of file.mkdirs() methods of File class.
package uz.coder.directories;

import java.io.File;

public class Directories {
    public static void main(String[] args) {
        String directories = "/home/coder/Desktop/myFolder";
        File file = new File(directories);
        boolean result = file.mkdir();
        System.out.println("Status = " + result);
    }
}
