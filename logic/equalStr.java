package logic;
//checks for equality by using 2 functions :- equals() & equalsIgnoreCase() 
// equals :- checks equality but it is case sensitive
// equalsIgnoreCase :- checks equality but it is not case sensitive

import java.util.Scanner;

class equal
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
      if(str1.equals(str2)) //equalsIgnoreCase() will ignore case sensitivity
      {
        System.out.println("Equal string");
      }
      else {System.out.println("Not Equal string");}
    }
}


public class equalStr
{
    public static void main (String []args)
    {
      equal aa = new equal();
      aa.getdata();
      aa.logic();
    }
}