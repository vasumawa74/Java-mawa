package logic.matrix;
//Java program to print right angle triangle
/*                 *****
                    ****
                     *** 
                      **
                       *                                */
import java.util.Scanner;

public class star4
{
    public static void main(String [] args)
    {
        int i,j,n,s;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        n=s1.nextInt();
        
         for(i=1;i<=n;i++)
         {
            for(s=1;s<=i;s++)
                       {System.out.print(" ");}
            for(j=1;j<=n+1-i;j++)
            {
                System.out.print("*");//you can enter various patterns here like i,j,i+j,i*j,etc...
            }
            System.out.println();
         }

    }
    
}
