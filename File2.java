import java.io.*;
import java.util.Scanner;
public class File2
{
    public static void main(String[] args)throws Exception
    {
        int line=1,word=0;           
        char ch;
        File f1 = new File("first.txt");
        //FileWriter fileWriter = new FileWriter("first.txt");
        FileWriter f2 = new FileWriter("first.txt");
       // fileWriter.write("Java is Object Oriented language");
       // fileWriter.close();
        f2.write("Java is Object Oriented language\nJava is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        f2.close();
    
        Scanner sc = new Scanner(f1);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
        /*FileReader fr=new FileReader("first.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    */

        FileInputStream f  =new FileInputStream("first.txt");
        int n=f.available();
        for(int j=0;j<n;j++)
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
        f.close();
    }
}