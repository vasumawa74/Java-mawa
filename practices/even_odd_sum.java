package practices;
//JAva program to do sum of even and product of odd numbers

import java.util.Scanner;

public class even_odd_sum {
    public static void main(String[] args)
    {
       int x,digi,sum=0,pro=1;
       System.err.print("This is the even odd number checking: \n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n Enter your number: ");
       Scanner eos = new Scanner(System.in);
       x=eos.nextInt();
        while(x>0)
        {
          digi=x%10;
           if(digi%2==0)
           {
            sum=sum+digi;
           }
           else
           {
            pro=pro*digi;
           }
           x=x/10;
        }
    System.out.println("Sum of even numbers:= " + sum + " Product of odd numbers:= " + pro);
    eos.close();

    }

}
