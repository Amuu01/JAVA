/*
import java.net.*;
import java.util.Scanner;

public class letterbox {
    public static void main(String[] args) {
        String word;
        boolean flag;
        try
        {
            ServerSocket serverSocket = new ServerSocket(1064);
            System.out.println("server Running");
            Socket socket = serverSocket.accept();
            Scanner sc = new Scanner(socket.getInputStream());
            word = sc.next();
            System.out.println("Word Recevied:");


        } 
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
*/