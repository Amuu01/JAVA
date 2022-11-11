import java.io.*;
public class File3
{
    public static void main(String[] args)throws Exception
    {
        FileWriter f2 = new FileWriter("first.txt");

        f2.write("Java is Object Oriented language\nJava is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        f2.write("\nIt is a general-purpose programming language intended to let programmers write once, run anywhere");

        f2.close();
        
        FileReader fr=new FileReader("first.txt");    
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);   
        } 
         
        fr.close();    
    }
}