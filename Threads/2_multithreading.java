package Threads;
class multithreading {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
         t2.start();
       
        
    } 
}
class Thread1 extends Thread{
    public void run(){
       while(true)
       {
        System.out.println("Thread 1 ");
       }
    }
    
}

class Thread2 extends Thread
{
    public void run()
    {
        while(true)
       {
        System.out.println("Thread 2 ");
       }
    }
    
}
