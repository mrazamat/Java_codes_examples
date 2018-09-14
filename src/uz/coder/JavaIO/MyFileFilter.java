// How to filter the files by file extensions and show the file names?
package uz.coder.JavaIO;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter {
    public static void main(String[] args) {
        File file = new File("/home/coder/Desktop/");
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".pdf")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f:files) {
            System.out.println(f);
        }
    }
}
