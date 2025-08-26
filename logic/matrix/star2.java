package logic.matrix;
//Java program to print upside down right angle triangle
/*                 *****
                   ****
                   *** 
                   **
                   *                                */
import java.util.Scanner;

public class star2
{
    public static void main(String [] args)
    {
        int j,n;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        n=s1.nextInt();
        
         for(;n>=1;n--)   //when given number>1 , for eg:-5, 5* at 1st row, 4* at 2nd row......so on
         {
            for(j=1;j<=n;j++)
            {
                System.out.print("*");//you can enter various patterns here like i,j,i+j,i*j,etc...
            }
            System.out.println();
         }
    }
}
