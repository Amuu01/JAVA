import java.io.*;
import java.net.*;
import java.util.Scanner;


public class client {
    public static void main(String[] args) throws Exception {

        String ip = "localhost";
        int port = 3000;

        Socket socket = new Socket(ip, port);
        System.out.print("Enter String data: ");
        Scanner sc = new Scanner(System.in);
        String firstName;
        firstName = sc.nextLine();
       
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        out.println(firstName);
        out.flush();
        sc.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = bufferedReader.readLine();
        System.out.println(data);
        socket.close();
    }
}