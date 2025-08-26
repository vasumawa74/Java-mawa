package multithreading;
//understanding multithreading
//thread functions :-get/set priority() , getId() , currentThread()


class A extends Thread
{
  public void run()
  {
    System.out.println("\n Inside thread A: \nThread ID:\t"+Thread.currentThread().threadId()+"\nThread Priority: "+Thread.currentThread().getPriority());
  }
}

class B extends Thread 
{
  public void run()
  {
    System.out.println("\n Inside thread B: \nThread ID:\t"+Thread.currentThread().threadId()+"\nThread Priority: "+Thread.currentThread().getPriority());
  }
}


class C extends Thread
{
  public void run()
  {
    System.out.println("\n Inside thread C: \nThread ID:\t"+Thread.currentThread().threadId()+"\nThread Priority: "+Thread.currentThread().getPriority());
  }
}

public class threadmeth2 
{
    public static void main(String[]args)
    {
        A aa=new A();
        B bb=new B();
        C cc=new C();

       aa.setPriority(Thread.MIN_PRIORITY);
       bb.setPriority(Thread.NORM_PRIORITY);
       cc.setPriority(Thread.MAX_PRIORITY);

       System.out.println("Inside main Thread and its Id is: "+Thread.currentThread().threadId()+"\n Main thread Priority="+Thread.currentThread().getPriority());

       System.out.println("Now caliing other Threads: Thread A-> Thread B-> Thread C->");
       aa.start();
       bb.start();
       cc.start();
    }
}
