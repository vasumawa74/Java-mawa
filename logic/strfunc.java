package logic;
//more string functions :- SubString() ; Concat() ; indexOf()

import java.util.Scanner;

class stringfunct
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

    void word()
    {
      System.out.println("\nUnderstanding substring\n\nString 1 after 3rd position= "+(str1.substring(3)));
      System.out.println("\nString 2 after 3rd position= "+(str2.substring(3)));
    }

    void join()
    {
      System.out.println("\nUnderstanding Concatination\nBoth strings after concat are "+(str1.concat(str2)));
    }

    void num()
    {
      System.out.println("\nUnderstanding indexOf\nindex of a in String 1 is "+ (str1.indexOf('a')));
      System.out.println("\nindex of a in String 2 is "+ (str2.indexOf('a')));
    }
}


public class strfunc
{
    public static void main (String []args)
    {
      stringfunct aa = new stringfunct();
      aa.getdata();
      aa.word();
      aa.join();
      aa.num();
    }
}