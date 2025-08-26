package logic.matrix;
//Java program to print right angle triangle
/*                    *
                     ***
                    ***** 
                   *******
                  *********   
                  *********
                   *******
                    ***** 
                     ***
                      *                               */

import java.util.Scanner;

public class star7
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
                       {System.out.print(" ");}
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");//you can enter various patterns here like i,j,i+j,i*j,etc...
            }
            System.out.println();
         }

         n=n-1;
          for(i=1;i<=4;i++)
         {
            for(s=1;s<i;s++)
                       {System.out.print(" ");}
            for(j=1;j<=2*(n-i)+1;j++)
            {
                System.out.print("*");//you can enter various patterns here like i,j,i+j,i*j,etc...
            }
            System.out.println();
         }
    }
}
