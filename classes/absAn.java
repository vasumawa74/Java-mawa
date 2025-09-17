//abstract class and anonymous class

 abstract class A   //cannot create any object
{ 
    public abstract void show() ;
}


public class absAn
{
    public static void main(String[] args)
    {
        A aa = new A()  //object of anonymous inner class ; can also be used for multiple methods
        {
        public void show()
         {
          System.out.println("HEy hoe");
        }
        };
        aa.show();
    }
}
