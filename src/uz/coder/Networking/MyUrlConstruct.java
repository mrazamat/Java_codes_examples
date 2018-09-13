package uz.coder.Networking;

import java.net.MalformedURLException;
import java.net.URL;

public class MyUrlConstruct {
    public static void main(String[] args) {
        String protocol = "https";
        String host = "www.facebook.com";
        int port = 443;
        String path = "/zuck/";
        try {
            URL url = new URL(protocol,host,port,path);
            System.out.println(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
