package logic.matrix;
//Java program to print right angle triangle
/*                 *
                   **
                   *** 
                   ****
                   *****                                */
import java.util.Scanner;

public class star1 
{
    public static void main(String [] args)
    {
        int i,j,n;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        n=s1.nextInt();
        
         for(i=1;i<=n;i++)   //to from numbers from 1-n
         {
            for(j=1;j<=i;j++) //to print stars at consecutive places, like 1* in 1st row ; 2** in 2nd row....
            {
                System.out.print("*");//you can enter various patterns here like i,j,i+j,i*j,etc...
            }
            System.out.println();
         }

    }
    
}
