package practices;
//Java program to check if a number is armstrong or not i.e for eg :-111 =(1^3)+(1^3)+(1^3)=111

import java.util.Scanner;

public class armst 
{
    public static void main(String [] args)
    {
    Scanner ar=new Scanner(System.in);
    int x,n1,n2,i,count=0,digit=0,pro,sum=0;
    System.out.print("Enter number to check if armstrong: ");
    x=ar.nextInt();
    n1=x;
    while(n1>0)
    {
      count++;
      n1=n1/10;//dividing by 10 until all digits are calculated
    }
   System.out.println("No of digits= "+ count );
   //we counted the digits of the number above and now to check if its armstrong
    n2=x;
    while(n2>0)
    {
      digit=n2%10;
           pro=1;
        for(i=1;i<=count;i++)    //the for loop here is to do x^y
        {
            pro=pro*digit;
            sum=sum+pro;
            n2=n2/10;
        }
    if(sum==x){System.out.println("Armstrong");}
    else{System.out.println("Armstrong");}
    }


    ar.close();
    } 
}
