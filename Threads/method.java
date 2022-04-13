package Threads;

public class method {
    public static void main(String[] args) {
        Thread t = new Thread("My Thread");
        System.out.println(t.getName());
        System.out.println(t.getId());
        t.start();
        t.interrupt();
        System.out.println(t.isAlive());
        try
        {
            Thread.sleep(1000);
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("state = " + t.getState());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());
        System.out.println("Priority = " + t.getPriority());
        System.out.println("state =  " + t.getState());
        

    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
}
