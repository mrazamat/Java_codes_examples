// Java Default URL Object Example
// Class URL represents a Uniform Resource Locator, a pointer to a "resource" on the World Wide Web.
// A resource can be something as simple as a file or a directory,
// or it can be a reference to a more complicated object, such as a query to a database or to a search engine.
// java.net.URL creates a URL object from the String representation.

package uz.coder.Networking;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class MySimpleURL {
    public static void main(String[] args) {
        try {
            String myURL = "https://google.com";
            URL url = new URL(myURL);
            System.out.println(url.getAuthority());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getProtocol());
            System.out.println(url.getUserInfo());
            System.out.println(url.toURI());
            System.out.println(url.getHost());
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}




















