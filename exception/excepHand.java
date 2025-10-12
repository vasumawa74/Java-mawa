public class excepHand 
{
    public static void main(String[]args)
    {
        @SuppressWarnings("unused")
        int a=10,b=5,x,c=5,y;   //taking b=c=5 so that b-c=0

        try
        {
            x=a/(b-c);  //actual logic -- critical statement
        }

        catch(ArithmeticException e) //only executed in case of exception
        {
         System.out.println("\tException : Division by zero"+e);  //exception body
        }

        y=a/(b-c);
        System.out.println("Result ="+y);
    }
}
