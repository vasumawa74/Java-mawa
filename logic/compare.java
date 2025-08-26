package logic;
//compareTo() function compares ascii values of two strings to return values
/*
 *    if(str1==str2) ----> returns 0
 *    if(str1>str2) ----> returns >0 (+ve value)
 *    if(str1<str2) ----> returns <0 (-ve value)
 */

import java.util.Scanner;

class check
{
    Scanner sc = new Scanner(System.in);
    String str1,str2;

    void getdata()
    {
    str1 = new String();
    str2 = new String();
    System.out.print("Enter 1st string to compare: ");
    str1=sc.nextLine();
    System.out.print("Enter 2nd string to check: ");
    str2=sc.nextLine();
    }

    void logic()
    {
      if(str1.compareTo(str2)==0)
      {
        System.out.println("Equal string");
      }
      else if (str1.compareTo(str2)>0)
      {
        System.out.println(str1+" is greater than "+str2);
      }
      else {System.out.println(str2+" is greater than "+str1);}
    }
}


public class compare
{
    public static void main (String []args)
    {
      check aa = new check();
      aa.getdata();
      aa.logic();
    }
}