package uz.coder.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyLocalHostName {
    public static void main(String[] args) {
        try{
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println(myHost.getHostName());

            // get hostname by IP address
            InetAddress host = InetAddress.getByName("216.239.38.120");
            System.out.println(host.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
