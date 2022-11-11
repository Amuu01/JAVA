
class Item1 {
    private int i;
    private boolean item = false;

    public synchronized void consume() {
        while(!item)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item = false;
        System.out.println("Consumed: " + i);
        notify();
    }

    public synchronized void produce(int i) {
        while(item){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.i = i;
        item = true;
        System.out.println("Produced: " + i);
        notify();
    }
}

class Producer implements Runnable {
    Item1 used;
    Producer(Item1 used) {
        this.used = used;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while (true) {
            try {
                used.produce(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    Item1 used;
    Consumer(Item1 used) {
        this.used = used;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            try {
                used.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Assign9 {
    public static void main(String[] args) {
        Item1  used = new Item1();
        new Producer(used);
        new Consumer(used);
    }
}
