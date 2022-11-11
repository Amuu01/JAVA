class item
{
    private int i;
    private boolean produced = false;
    public synchronized void consumed()
    {
        while(!produced)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                //System.out.println(e.getMessage());
                //e.getMessage();
                e.printStackTrace();
            }
            produced=false;
            System.out.println("Consumed: " +i);
            notify();
        }
    }
    public synchronized void produced(int x)
    {
        while(produced)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
               // System.out.println(e.getMessage());
               // e.getMessage();
               e.printStackTrace();
            }
            i=x;
            produced=true;
            System.out.println("Produced: " + i);
            notify();
        }
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
            } catch (InterruptedException e) {
               //System.out.println(e.getMessage());
               e.printStackTrace();
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
            } catch (InterruptedException e) {
                //System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
            
    }
}
public class A09
{
    public static void main(String[] args)
    {
        item I = new item();
        new producer(I);
        new consumer(I);
    }    
}
