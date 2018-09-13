//How to get list of all IPs of a given Host in Java?
package uz.coder.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyAllIpAddresses {
    public static void main(String[] args) {
        try{
            InetAddress[] myHost = InetAddress.getAllByName("www.google.com");
            for (InetAddress host : myHost){
                System.out.println(host.getHostAddress());
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
