package org.example.intro;

class ThreadEx1 implements Runnable
{
    public void run(){
        for(int i=1; i<5; i++){
            System.out.println(i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ThreadEx2 implements Runnable
{
    public void run(){
        for(int i=1; i<5; i++){
            System.out.println("geh");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Counter
{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadsDemo {
    public static void main(String a[]) throws InterruptedException {

        ThreadEx1 obj1 = new ThreadEx1();
        ThreadEx2 obj2 = new ThreadEx2();

        //obj1.setPriority(Thread.MAX_PRIORITY);  // priority

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        //thread1.start();
        //thread2.start();


        Counter c = new Counter();

        Runnable obj3 = () ->
        {
           for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Runnable obj4 = () ->
        {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(c.count);

    }
}
