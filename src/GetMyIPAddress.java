import java.net.DatagramSocket;
import java.net.InetAddress;


public class GetMyIPAddress {
    public static void main(String[] args) throws Exception {
        // Method 1;
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My IP Address is: " + myIP.getHostAddress());

        // Method 2;
        try(final DatagramSocket socket = new DatagramSocket()){
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            String ip = socket.getLocalAddress().getHostAddress();
            System.out.println(ip);
        }
        // Get Host name
        System.out.println("Host Name:- " + myIP.getHostName());


    }
}
