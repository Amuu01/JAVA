import java.util.*;
public class array2 {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size = sc.nextInt();
        //int[] arr = new int[]{10,25,34,55,100};
        int [] X = new int[size];
        System.out.println("Enter the elements of the array: "); 
       for(int i=0;i<size;i++)
        {
            X[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum=sum+X[i];
        }
        System.out.println("Sum Of Array:"+sum);
        sc.close();
    }
}
