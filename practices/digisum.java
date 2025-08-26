package practices;
//java program to find the sum and product of digits of a number

import java.util.Scanner;

public class digisum 
{
    public static void main(String[] args)
    {
        int i,n,sum=0,pro=1,y;
        Scanner pn = new Scanner(System.in);
        System.out.print("Enter number: ");
        n=pn.nextInt();
        y=n;
        i=n;
        while(n>0)
        {
           sum=sum+n%10;
           n=n/10;
           
        }
        while(y>0)
        {
            pro=pro*(y%10);
             y=y/10;
        }
        System.out.println("The sum of digits of "+ i +" is " +sum + "\n The product of digits is "+ pro);
        pn.close();

    }
}
