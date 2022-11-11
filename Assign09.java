class item
{
    private int i;
    private boolean itemproduced = false;
    
    public synchronized void consumed()
    {
        if(!itemproduced)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
        itemproduced=false;
        System.out.println("Consumed: " +i);
        notify();
    }
    public synchronized void produced(int x)
    {
        if(itemproduced)
        {
            try
            {
                wait();
            }
            catch (Exception e)
            {
               System.out.println(e.getMessage());
            }
        }
        i=x;
        itemproduced=true;
        System.out.println("Produced: " + i);
        notify();
    }
   
}
class producer implements Runnable
{
    item I;
    producer(item I)
    {
        this.I=I;
        new Thread(this, "producer").start();
    }
    public void run()
    {
        int x=0;
        while(true)
        {
            try {
                I.produced(x++);
                Thread.sleep(1000);
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
           
        }
    }
    
}
class consumer implements Runnable
{
    item I;
    consumer(item I)
    {
        this.I=I;
        new Thread(this, "consumer").start();
    }
    public void run()
    {
        while(true)
        {
            try {
                I.consumed();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            
    }
}
public class Assign09
{
    public static void main(String[] args)
    {
        item I = new item();
        new producer(I);
        new consumer(I);
    }    
}