public class excepHand 
{
    public static void main(String[]args)
    {
        int a=10,b=5,x,c=5,y;

        try
        {
        x=a/(b-c);  //exception body
        }
        catch(ArithmeticException e)
        {
         System.out.println("Divide by zero");
        }

        y=a/(b-c);
        System.out.println("y="+y);
    }
}
