class X1
{
    private int no;
    private String name;
    static int cnt=0; //static variable
    X1() //Constructor
    {
        no=10;
        name="RAVI";
        cnt++;
    }
    X1(int n,String str) //parametrised constructor
    {
        this();//calls default constructor
        no=n;
        name=str;
    }
    X1 copy(X1 a)
    {
        no=a.no;
        name=a.name;
        return this;
    }
    static void temp()
    {
        System.out.println("Static function");
        cnt=10;
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
public class class2 {
    public static void main(String[] args) {
        X1 obj = new X1();
        //X obj2 = new X(100,"RAJU");
        X1 obj3 = new X1();
        X1 obj4 = new X1();
        obj4 = obj3.copy(obj);
        System.out.println("Obj4");
        obj3.display();
        System.out.println("Obj4");
        obj4.display();
        //System.out.println(obj.no);
        //System.out.println(obj.name);
        System.out.println("Count Value is : "+X1.cnt);
        X1.temp();
        disp(); //static method declared in main function can be directly called
    }
    static void disp()
    {
        System.out.println("Static METHOD IN main");
    }
    void show()
    {
        System.out.println("Non static method");
    }
}
//static function to static function in same class call directly
//static function to static function in different  class call using class name
//static to non static -> use class or object
//non static to static directly you can call