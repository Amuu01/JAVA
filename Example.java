class Box
{
    private int length,breadth,height; //instance member variable
    public void setDimension(int l,int b,int h)//instance member function
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension()
    {
        System.out.println("L="+length);
        System.out.println("B="+breadth); 
        System.out.println("H="+height);   
    }
}
class Example
{
    public static void main(String[] args)
    {
        Box smallBox=new Box();
        smallBox.setDimension(12,10,15);
        smallBox.showDimension();
    }
}