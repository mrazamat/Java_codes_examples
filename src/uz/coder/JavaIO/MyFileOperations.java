//  Below example shows basic operations on File object.
//
//  canRead(): Tests whether the application can read the file
//  canWrite(): Tests whether the application can modify the file
//  createNewFile(): Tests whether the application can modify the file
//  delete(): Deletes the file or directory
//  exists(): Tests whether the file or directory exists.
//  getAbsolutePath(): Returns the absolute pathname string.
//  isDirectory(): Tests whether the file is a directory or not.
//  isHidden(): Tests whether the file is a hidden file or not.
//  list(): Returns an array of strings naming the
//	files and directories in the directory.
package uz.coder.JavaIO;

import java.io.File;
import java.io.IOException;

public class MyFileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            System.out.println("Can read file? " + file.canRead());
            System.out.println("Can write file? " + file.canWrite());
            System.out.println("Can create new file? " + file.createNewFile());
            System.out.println("Can delete file? " + file.delete());
            System.out.println("Exists file? " + file.exists());
            System.out.println("Get file path? " + file.getAbsolutePath());
            System.out.println("Is Directory? " + file.isDirectory());
            System.out.println("Is Hidden? " + file.isHidden());
            System.out.println("File list? " + file.list());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
