package practices;
//Java program to check if a number is armstrong or not i.e for eg :-111 =(1^3)+(1^3)+(1^3)=111

import java.util.Scanner;

public class armstE
{
    public static void main(String [] args)
    {
    Scanner ar=new Scanner(System.in);
    int re,sum=0,temp,n;
    System.out.print("Enter number to check if armstrong: ");
    n=ar.nextInt();
    temp=n;
    while(n>0)
    {
      re=n%10;
      sum=sum+re*re*re;
      n=n/10;
    }
    System.out.println("THE calculated number is= "+ sum);
    if(temp==sum){System.out.println("Yes its armstrong");}
    else{System.out.println("NO its not armstrong");}
        ar.close();
    } 
}
