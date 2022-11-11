/* Write a Java program that implements a simple client/server application.
The client sends data to a server.
The server receives the data, uses it to produce a result, and then sends the result back to the client.
The client displays the result on the console. */

import java.io.*;
import java.net.*;
import java.util.Scanner;

//Server Program
public class JAVA010_01 {
    public static void main(String args[]) {
        int factorial, num;
        try {
            ServerSocket serverSocket = new ServerSocket(1064);
            System.out.println("Server Running");
            Socket socket = serverSocket.accept();
            Scanner scanner = new Scanner(socket.getInputStream());
            num = scanner.nextInt();
            System.out.println("Value Received!");
            factorial = factorial(num);
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            printStream.println(String.valueOf(factorial));
            printStream.close();
            scanner.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else if (num <= 0) {
            return 0;
        } else {
            return num * factorial(num - 1);
        }
    }
}