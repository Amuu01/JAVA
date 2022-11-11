/* Write a Java program that correctly implements producer consumer problem using the concept of inter thread communication. */

class Utility {
    private int i;
    private boolean value = false;

    public synchronized void consume() {
        while(!value)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = false;
        System.out.println("Consumed: " + i);
        notify();
    }

    public synchronized void produce(int i) {
        while(value){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.i = i;
        value = true;
        System.out.println("Produced: " + i);
        notify();
    }
}

class Producer implements Runnable {
    Utility util;
    Producer(Utility util) {
        this.util = util;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while (true) {
            try {
                util.produce(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    Utility util;
    Consumer(Utility util) {
        this.util = util;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            try {
                util.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JAVA009 {
    public static void main(String[] args) {
        Utility util = new Utility();
        new Producer(util);
        new Consumer(util);
    }
}