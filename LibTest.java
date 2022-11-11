import java.util.*;

class Library1
{
    String [] availableBooks = new String[100];

    public void addBook(String a)
    {
        for (int i=0;i<=availableBooks.length;i++)
        {
            if (availableBooks[i]==null)
            {
                availableBooks[i]=a;
                System.out.println("Book added successfully");
                break;
            }
        }
    }

    public void showAvailableBooks()
    {
        System.out.println("The Books that are available in the Library are:");
        for(int i=0;availableBooks[i]!=null;i++)
        {
            System.out.println(i+" :- "+availableBooks[i]);
        }
    }
}

public class LibTest 
{
    public static void main(String[] args) 
    {
        Library1 library = new Library1();
        System.out.println("\nWelcome to library management system\n");
        System.out.println("Enter 1 to ADD book.\n\nEnter 2 SHOW Available books.\n\nEnter 3 to EXIT.  ");
        System.out.println("\nEnter your choice : ");
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int user = sc.nextInt();
            if (user==1) 
            {
                System.out.println("Enter the book name that you want to add in the library");
                String addBk = sc.next();
                library.addBook(addBk);
            }
            else if (user==2) 
            {
                library.showAvailableBooks();
            }
            else if (user==3)
            {
                System.out.println("Thanks for visiting library management system");
                break;
            }
            else
            {
                System.out.println("Not a valid input.");
            }
        }
        sc.close();
    }
} 