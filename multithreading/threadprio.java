package multithreading;
//understanding multithreading
//go through threadmeth2.java to understand get/set priority better


class A extends Thread
{
  public void run()
  {
    try
           {
            sleep(10);
           }
           catch(Exception e){}


    System.out.println("Thread A started\n");
    for(int i=0;i<=5;i++)
    {
        
        System.out.println("From thread A : i="+i);
    }
    System.out.println("End of thread A\n");
  }
}
class B extends Thread 
{
  public void run()
  {
    try
           {
            sleep(10);
           }
           catch(Exception e){}


    System.out.println("Thread B started\n");
    for(int j=0;j<=5;j++)
    {
        
        System.out.println("From thread B : j="+j);
    }
    System.out.println("End of thread B\n");
  }
}
class C extends Thread
{
  public void run()
  {
    try
           {
            
            sleep(10);
           }
           catch(Exception e){}


    System.out.println("Thread C started\n");
    for(int k=0;k<=5;k++)
    {
        
        System.out.println("From thread C : k="+k);
    }
    System.out.println("End of thread C\n");
  }
}

public class threadprio 
{
    public static void main (String[]args)
    {
     A aa=new A();
     B bb = new B();
     C cc = new C();

     cc.setPriority(Thread.MAX_PRIORITY);
     bb.setPriority(aa.getPriority()+1);
     aa.setPriority(Thread.MIN_PRIORITY);

     System.out.println("Thread A started:-");
     aa.start();
     System.out.println("Thread B started:-");
     bb.start();
     System.out.println("Thread C started:-");
     cc.start();
     System.out.println("Main Thread ended");
    }
    
}
