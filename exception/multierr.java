//Exception handling of multiple errors

public class multierr 
{
   public static void main (String [] args)
   {@SuppressWarnings("unused")
    int a, b=10;

    int num[]=new int[5];
     
    String abc=null;
    
    try
    {
      a=18/b;
      System.out.println(abc.length());
      System.out.println(num[1]);
      System.out.println(num[4]);
    }

    catch(ArithmeticException e)
    {
       System.out.println("Something went wrong...\n\t Cannot divide by zero");
    }

    catch(ArrayIndexOutOfBoundsException v)
    {
      System.out.println("Something went wrong...\n\tThe Given array index is out of bound ");
    }

    catch(NullPointerException w)
    {
      System.out.println("Something went wrong...\n\tNull String doesnt Have any length");
    }
    

    catch(Exception p)
    {
      System.out.println("-Default exception-Something went wrong...");
    }
    

    System.out.println("Result = ");
   }    
}
