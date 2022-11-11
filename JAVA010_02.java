/* Write a Java program that implements a simple client/server application.
The client sends data to a server.
The server receives the data, uses it to produce a result, and then sends the result back to the client.
The client displays the result on the console. */

import java.io.*;
import java.net.*;
import java.util.Scanner;

//Client Program
public class JAVA010_02 {
    public static void main(String args[]) throws IOException {
        int factorial, num;
        Socket socket = new Socket(InetAddress.getLocalHost(), 1064);
        System.out.print("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        num = scanner.nextInt();
        printStream.println(String.valueOf(num));
        scanner.close();
        scanner = new Scanner(socket.getInputStream());
        factorial = scanner.nextInt();
        System.out.println("Factorial: " + factorial);
        printStream.close();
        scanner.close();
        socket.close();
    }
}