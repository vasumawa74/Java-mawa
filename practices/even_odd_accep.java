package practices;
import java.util.Scanner;

public class even_odd_accep
{
    public static void main(String[] args)
    {
       int x ;
       System.err.print("This is the even odd number checking: \n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n Enter your number: ");
       Scanner eo = new Scanner(System.in);
       x=eo.nextInt();


       if(x%2==0)  //remainder of x divided by 2 is 0
              {
                System.out.println(x + " is even number ");
              }
        else
              {
                System.out.println(x + " is an odd number");
              }

    eo.close();

    }
    
}
