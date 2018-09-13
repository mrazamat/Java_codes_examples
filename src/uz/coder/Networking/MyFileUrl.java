package uz.coder.Networking;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFileUrl {
    public static void main(String a[]){
        try {
            URL url = new URL("file://text.txt");
            System.out.println(url.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
