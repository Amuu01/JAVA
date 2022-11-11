import java.io.IOException;
import java.util.*;

class Book_R
{
    Scanner sc1 = new Scanner(System.in);
    private int bid;
    private String bname,author;
    private int stock;
    Book_R()
    {
        System.out.println("Enter Basic Details of Books");
        System.out.print("Book Id:");
        //bid = sc1.nextInt();
        bid= Integer.parseInt(sc1.nextLine());
        System.out.print("Book Name:");
        bname = sc1.nextLine();
        System.out.print("Book Author:");
        author = sc1.nextLine();
        System.out.print("Book Stock:");
        //stock = sc1.nextInt();
        stock= Integer.parseInt(sc1.nextLine());
    }
    void showBook()
    {
        System.out.println(bid + "\t" + bname + "\t" + author +"\t\t\t"+stock); 
        
    }
    public int getBid()
    {
        return bid;
    }
    public int getStock()
    {
        return stock;
    }
    public String getBname()
    {
        return bname;
    }
    public String getAuthor()
    {
        return author;
    }
    public int returnBook()
    {
        stock++;
        return 1;
    }
    public int takebook()
    {
        if(stock > 0)
        {
            stock--;
            return 1;
        }
        else
            return 0;
    }
    /*public void setDetails()
    {
        System.out.println("Enter Basic Details of Books");
        System.out.print("Book Id:");
        //bid = sc1.nextInt();
        bid= Integer.parseInt(sc1.nextLine());
        System.out.print("Book Author:");
        author = sc1.nextLine();
        System.out.print("Book Stock:");
        //stock = sc1.nextInt();
        stock= Integer.parseInt(sc1.nextLine());
    }*/
    
}
class Student_R
{
    private int sid;
    private String name;
    private long phone;
    Scanner s1 = new Scanner(System.in);
    Student_R()
    {
        System.out.println("Enter Basic Details of Students");
        System.out.print("Student Id:");
        //sid = s1.nextInt();
        sid = Integer.parseInt(s1.nextLine());
        System.out.print("Student Name:");
        name = s1.nextLine();
        System.out.print("Contact No:");
        //phone = s1.nextLong();
        phone = Long.parseLong(s1.nextLine());
    }
    public int getsid()
    {
        return sid;
    }
    public String getname()
    {
        return name;
    }
    public long getphone()
    {
        return phone;
    }
    void setStudent()
    {
        System.out.println("Enter Basic Details of Students");
        System.out.print("Student Id:");
        //sid = s1.nextInt();
        sid = Integer.parseInt(s1.nextLine());
        System.out.print("Student Name:");
        name = s1.nextLine();
        System.out.print("Contact No:");
        //phone = s1.nextLong();
        phone = Long.parseLong(s1.nextLine());
    }

    void showStudent()
    {
        /*System.out.println("----Student Details----");
        System.out.println("-----------------------------------");
        System.out.println("ID: " + sid);
        System.out.println("Name: " + name );
        System.out.println("Author: " + phone); */
        System.out.println(sid + "\t" + name + "\t" + phone);       
    }
  
}
public class library_r extends Student_R
{
    public static int NOB=0,NOS=0,book_id,s_id,k;
    //NOB=no of books
    //NOS=no of students
    public static Book_R[] B = new Book_R[100];
    public static Student_R[] S = new Student_R[100];
    public static Scanner sc = new Scanner(System.in);
    public static int searchBooks(int isbn) {
        for (int i = 0; i < NOB; i++)
        {
            if (B[i].getBid() == isbn)
                return i;
        }
        return -1;
    }
  public static void main(String[] args) throws IOException
  {
    int ch;
    do
    {
        System.out.println("!!!Library System!!!");
        System.out.println("-----------------------");
        System.out.println("1.Add Book");
        System.out.println("2.Add Student");
        System.out.println("3.Issue Book");
        System.out.println("4.Return Book");
        System.out.println("5.Display Book");
        System.out.println("6.Display Student");
        System.out.println("7.EXIT");
        System.out.println("-----------------------");
        System.out.print("Enter Choice:");
        //ch = Integer.parseInt(sc.nextLine());
        ch = sc.nextInt();
        //System.out.print("\n-----------------------");
        switch (ch)
        {
            case 1:
                //B[NOB].setDetails();
                B[NOB] = new Book_R();
                System.out.println("Record Added successfully\n");
                NOB++;
                break;
            case 2:
                //S[NOS].setStudent();
                S[NOS] = new Student_R();
                System.out.println("Record Added successfully\n");
                NOS++;
                break;
            case 3:
                if(NOS>0)
                {
                    System.out.print("Enter Student Id:");
                    s_id = sc.nextInt();
                    for(int i=0; i<NOS; i++)
                    {
                        if(s_id==S[i].getsid())
                        {
                            System.out.print("Enter Book Id to Issue:");
                            book_id = sc.nextInt();
                            for(int j=0;j<NOB;j++)
                            {
                               /* if(book_id==B[i].getBid())
                                {
                                    B[i].takebook();
                                    System.out.println("Book Issued");
                                }
                                else{
                                    System.out.println("Book Id Doesn't Exist");
                                }*/
                                
                                k = (searchBooks(book_id));
                            }
                            if(k!=-1)
                            {
                                B[k].takebook();
                                System.out.println("Book Issued");
                            }
                            else{
                                System.out.println("Book Not Available!");
                            }
                            
                        }
                    }
                }
                else{
                    System.out.println("No Student  Record Exist");
                }
                break;
            case 4:
            if(NOS>0)
            {
                System.out.print("Enter Student Id:");
                s_id = sc.nextInt();
                for(int i=0; i<NOS; i++)
                {
                    if(s_id==S[i].getsid())
                    {
                        System.out.print("Enter Book Id to Return:");
                        book_id = sc.nextInt();
                        for(int j=0; j<NOB;j++)
                        {
                            /*if(book_id==B[i].getBid())
                            {
                                B[i].returnBook();
                                System.out.println("Book Returned Successfully");
                            }
                            else{
                                System.out.println("Book Id Doesn't Exist");
                            }*/
                            k = (searchBooks(book_id));
                        }
                        if(k!=-1)
                        {
                            B[k].returnBook();
                            System.out.println("Book Returned");
                        }
                        else{
                                System.out.println("Book Not Available!");
                            }

                        
                    }
                }
            }
            else{
                System.out.println("No Student  Record Exist");
            }
                break;
            case 5:
                if(NOB>0)
                {
                    System.out.println("----Book Details----");
                    System.out.println("-----------------------------------");
                    System.out.println("Id" + "\tName" +"\tAuthor" + "\t\tStock");
                    for (int i = 0; i < NOB; i++)
                     B[i].showBook();
                    
                }    
                else
                {
                    System.out.println("No Book Record Exist");
                }
                break;
            case 6:
                if(NOS>0)
                {
                    System.out.println("------------Student Details-------");
                    System.out.println("-----------------------------------");
                    System.out.println("Id" + "\tName" +"\t\tPhone");
                    for(int k=0;k<NOS;k++)
                     S[k].showStudent();
                }
                else
                {
                    System.out.println("No Student Record Exist");
                }
                break;
            case 7:
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
        
    }while (ch!=7);
 }
}

