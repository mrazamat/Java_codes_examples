// How To Get URL Properties in Java

package uz.coder.Networking;

import java.net.MalformedURLException;
import java.net.URL;

public class MyUrlProperties {
    public static void main(String[] args) {
        try {
            String url = "http://www.example.com:80/java/?query=ok#header";
            URL myUrl = new URL(url);
            System.out.println("Protocol: " + myUrl.getProtocol());
            System.out.println("Host: " + myUrl.getHost());
            System.out.println("Port: " + myUrl.getPort());
            System.out.println("Athority of the URL: " + myUrl.getAuthority());
            System.out.println("Query: " + myUrl.getQuery());
            System.out.println("Reference: " + myUrl.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
