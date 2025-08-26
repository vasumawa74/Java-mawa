package logic;
import java.util.Scanner;

public class printnum 
{
    public static void main(String[] args)
    {
        int i,n,sum=0;
        @SuppressWarnings("resource") //to stop resource leak minor error
        Scanner pn = new Scanner(System.in);
        System.out.print("Enter number to which whole no.s are to be printed: ");
        n=pn.nextInt();

        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("The sum of "+ n +" numbers are " +sum);
        pn.close();

    }
}
