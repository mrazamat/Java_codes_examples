// Compare Two URL Objects In Java
package uz.coder.Networking;

import java.net.MalformedURLException;
import java.net.URL;

public class MyUrlCompare {
    public static void main(String[] args) {
        try {
            URL mysite =new URL("http://coder.uz");
            URL google =new URL("http://google.com");
            if (mysite.equals(google))
                System.out.println("Both sites are equal");
            else
                System.out.println("Both sites are not equal");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
