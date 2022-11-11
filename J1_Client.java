import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class J1_Client
{
    public static void main(String[] args)
    {
        try {
            Socket s = new Socket(InetAddress.getLocalHost(),1064);
            
            System.out.print("Enter a String : ");
            String A;
            Scanner sc = new Scanner(System.in);
            PrintStream ps = new PrintStream(s.getOutputStream());
            A=sc.nextLine();
            ps.println(A);
            sc.close();
        
            ps.close();
            s.close();
           
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
