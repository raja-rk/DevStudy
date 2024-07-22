
class demo1 implements Runnable{
    public synchronized void run(){
        System.out.println("thread 1...");
    }
}
class demo2 implements Runnable{
    public synchronized void run(){
        System.out.println("thread 2...");
    }
}

public class Threads {
    public static void main(String a[]) throws InterruptedException{
        Runnable obj1 = new demo1();
        Runnable obj2 = new demo2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
