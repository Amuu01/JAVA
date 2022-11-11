//import java.math.*;
//import java.text.NumberFormat.Style;
import java.util.*;
public class Calculation {
    public static void main(String[] args) {
    int num3=0;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter 1st Number:");
    int num1=sc.nextInt();
    System.out.print("Enter 2nd Number:");
    int num2=sc.nextInt();
    num3=num1+num2;
    if(num1>num2)
    System.out.println("Num1 is greater");
    else
    System.out.println("Num2 is greater");
    System.out.println("Sum="+num3);
    double x=sc.nextDouble();
    x=Math.sqrt(x);
    System.out.println("SQRT="+x);  
    int i=0;
    while(i<x)
    {
        System.out.print(i+" ");
        i++;
    } 
    sc.close();
    }
}
