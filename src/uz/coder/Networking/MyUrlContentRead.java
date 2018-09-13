package uz.coder.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MyUrlContentRead {
    public static void main(String[] args) {
        URL url = null;
        InputStream is = null;
        try {
            url = new URL("http://google.com");
            is = url.openStream();
            byte[] b = new byte[8];
            while (is.read(b) != -1)
                System.out.println(new String(b));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
