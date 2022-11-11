//interfaces
interface Area
{
    //only abstract methods and final static fields
    final static float pi=3.14f;
    void show();
    void compute(float x, float y);
}
interface add1 extends Area
{
    final static int size=10;
    void disp();
}
class B
{
    void input()
    {
        System.out.println("Input");
    }
}
class A extends B implements add1
{
    public void disp()
    {
        System.out.println("hii");
    }
    public void show()
    {
        System.out.println("Hello");
    }
    public void compute(float x,float y)
    {
        System.out.println("Interface");
    }
}
public class Java25 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.disp();
        obj1.show();
        obj1.input();
    }
}
