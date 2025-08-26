package practices;
import java.util.Scanner;

public class rev 
{
    public static void main(String[] args)
    {
        int i,n,rev=0;
        @SuppressWarnings("resource")
        Scanner pn = new Scanner(System.in);
        System.out.print("Enter number to br reversed: ");
        n=pn.nextInt();
        i=n;
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("The reverse of "+ i  +" is: " +rev);
        pn.close();
    }
}

