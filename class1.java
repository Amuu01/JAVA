class M
{
    private int no;
    private String name;
    M() //Constructor
    {
        no=10;
        name="RAVI";
    }
    M(int n,String str) //parametrised constructor
    {
        no=n;
        name=str;
    }
    void input()
    {
        System.out.println("Enter No:");
        no=10;
        name="RAVI";
    }
    void display()
    {
        //System.out.println("Hii");
        System.out.print("Number is:"+no);
        System.out.print("Name is:"+name);
    }
}
public class class1 {
    public static void main(String[] args) {
       M obj = new M();
        M obj2 = new M(100,"RAJU");
        //obj.input();
        obj.display();
        obj2.display();
        //System.out.println(obj.no);
        //System.out.println(obj.name);
    }
}
