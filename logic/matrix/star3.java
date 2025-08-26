package logic.matrix;
//Java program to print spaced right angle triangle
/*                     *
                      ** 
                     *** 
                    ****
                   *****                                */
import java.util.Scanner;

public class star3
{
    public static void main(String [] args)
    {
        int i,j,n,s;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        n=s1.nextInt();
        
         for(i=1;i<=n;i++)
         {
            for(s=1;s<=n-i;s++)
                       {System.out.print(" ");} /*space printing :-
                        as if there are 5 rows,
                         1 star is to be printed while other is space
                         Therefore, (n-i) i.e 5-1=4 space; 5-2=3 space;...etc */
            for(j=1;j<=i;j++)
            {
                System.out.print("*");//you can enter various patterns here like i,j,i+j,i*j,etc...
            }
            System.out.println();
         }

    }
    
}
