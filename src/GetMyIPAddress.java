import java.net.InetAddress;


public class GetMyIPAddress {
    public static void main(String[] args) throws Exception {
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My IP Address is: " + myIP.getHostAddress());
    }
}
