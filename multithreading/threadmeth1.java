package multithreading;
//understanding multithreading
//thread functions :-yield() & sleep() & stop()

class A extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
    {
        if(i==1)
        {
        
        System.out.println("From thread A : i="+i);
        Thread.yield();
        }
    }
    System.out.println("End of thread A\n");
  }
}

class B extends Thread 
{
    public void run() 
    {
        for (int j = 1; j <= 5; j++) 
        {
            System.out.println("From thread B :j=" + j);
            if (j == 3)
            {
                Thread.currentThread().interrupt();
            }
            if (Thread.interrupted()) 
            break; 
            
        }
        System.out.println("End of thread B\n");
    }
}


class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
           System.out.println("From thread C :k="+k);
           if(k==1)
           try
           {
            sleep(1000);
           }
           catch(Exception e){}
        }
        System.out.println("End of thread C\n");
    }
}

public class threadmeth1 
{
    public static void main(String[]args)
    {
        A thread1=new A();
        B thread2=new B();
        C thread3=new C();

        System.out.println("Thread A is being started...");
        thread1.start();
        System.out.println("Thread B is being started...");
        thread2.start();
        System.out.println("Thread C is being started...");
        thread3.start();
    }
    
}
