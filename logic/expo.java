package logic;
//Java program to find x^y

import java.util.Scanner;

public class expo
{
    public static void main(String [] args)
    {
    Scanner ar=new Scanner(System.in);
    int x,y,pro=1;
    System.out.print("Enter base number= ");
    x=ar.nextInt();
    System.out.print("Enter Exponential power= ");
    y=ar.nextInt();
    while(y>0)
    {
      pro=pro*x;
      y--;
    }
    System.out.println("Value= "+ pro);


        ar.close();
    } 
}
