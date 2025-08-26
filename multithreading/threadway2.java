package multithreading;
//second way of creating a thread is by implementing runnable interface

class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread A "+i);
        }
        System.out.println("End of Thread A");
    }
}

public class threadway2 
{
    public static void main(String[]args)
    {
      A aa=new A();
      Thread tt = new Thread(aa);  //passing obj A into thread
      tt.start();
      System.out.println("End of main Thread");
    }
}
