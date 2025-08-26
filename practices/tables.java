package practices;

import java.util.Scanner;
public class tables
{
    public static void main(String []args)
    {
       int j,n;
       System.out.print("Enter number to find table= ");
       Scanner pn=new Scanner(System.in);
       n=pn.nextInt();
       for(j=1;j<=10;j++)
       {
        System.out.println(n + " * "+j+ " = " +(n*j));
         pn.close();
       }
    }
}
