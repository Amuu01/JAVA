
import java.net.*;
import java.util.Scanner;


public class J1_Server
{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1064);
            System.out.println("Server Is Running...Waiting for Client!!!");
            Socket s = ss.accept(); //establishes connection and waits for the client 
            Scanner sc = new Scanner(s.getInputStream());
            String str = sc.nextLine();
            System.out.println("Client: "+str);
            ss.close();

        } catch (Exception e) {
            
        System.out.println(e);
        }
    }
}
