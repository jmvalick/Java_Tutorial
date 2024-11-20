package org.example;

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

public class ThreadsDemo {
    public static void main(String a[]) {

        ThreadEx1 obj1 = new ThreadEx1();
        ThreadEx2 obj2 = new ThreadEx2();

        //obj1.setPriority(Thread.MAX_PRIORITY);  // priority

        Thread thread1 = new Thread(obj2);
        Thread thread2 = new Thread(obj1);

        thread1.start();
        thread2.start();

    }
}
