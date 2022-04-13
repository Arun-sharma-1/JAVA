package Threads;
// import java.lang.*;
class intro {
    public static void main(String[] args) {
        System.out.println("starting....");
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();

        Thread th = new Thread("name of thread ");
        System.out.println(th.getName());
        System.out.println(th.getState());

        customThread t3 = new customThread();
        Thread t = new Thread(t3 , "NAME");
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1");
    }
    
}

class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2");
    }
    
}
class customThread implements Runnable
{
    public void run()
    {
        System.out.println("customThread...");
    }
}

 