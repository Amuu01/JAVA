import java.util.*;
import java.io.*;
public class File1
{
    public static void main(String args[])throws IOException
    {
         int line=1,word=0;           
         char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter File name: ");
        String str=sc.nextLine();
        FileInputStream f  =new FileInputStream(str);
        int n=f.available();
        for(int i=0;i<n;i++)
            {
                ch=(char)f.read();
                if(ch =='\n')
                    line++;
                else if(ch==' ')
                    word++;
                                                                       
            }
        System.out.println("\nNumber of lines : "+line);
        System.out.println("\nNumber of words : "+(line+word));
        System.out.println("\nNumber of characters : "+n);          
        sc.close();
        f.close();
    }
}