package logic;
//FActorial 4!=4*3*2*1

import java.util.Scanner;

public class factorial 
{
    public static void main(String []args)
    {
        Scanner fa = new Scanner(System.in);
        int x,fac=1;
        System.out.print("Enter the number: ");
        x=fa.nextInt();
        while(x>1)
        {
          fac=fac*x;
          x=x-1;
        }

    System.out.println("Factrorial= "+ fac);
    fa.close();
    }
    
}
