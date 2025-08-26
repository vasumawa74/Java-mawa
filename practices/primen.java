package practices;
//Java code to find prime numbers between 1-n

import java.util.Scanner;
public class primen
{
    public static void main(String []args)
    {
       int i,j,count,n,total=0;
       System.out.print("Enter range to check prime number= ");
       Scanner pn=new Scanner(System.in);
       n=pn.nextInt();
       System.out.println("The prime num are= ");
       for(i=1;i<=n;i++)
       {
        //here i=1,2,3,4,...,100 so we have to check i
          count=0; //reset count=0
           for(j=1;j<=i;j++) //to check i we use another var J
           {
            
            if(i%j==0){count++;} //if the remainder of i/j=0 (completely divisible)
           }
        if(count==2)
        {  
            System.out.println(i);
            total++;
        }
       }
       System.out.println("Total prime numbers are: " + total);
    }
}
