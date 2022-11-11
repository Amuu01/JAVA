import java.util.*;
public class arr{
    public static void main(String[] args) {
        System.out.println("Enter Size of  arrya: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int mat[][] = new int[n][n];
        // int[][] mat = {{0,1,1,0,0,1,}};
        // int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nData you entered : \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(mat[i][j]);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
} 
