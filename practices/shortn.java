package practices;
//to print shortform of names:- Eg: Mohan lal kumar ::-- M.L. Kumar
import java.util.Scanner;

class name
{
    Scanner sc = new Scanner(System.in);
    String str1;

    void getdata()
    {
    str1 = new String();
    System.out.print("Enter Your name: ");
    str1=sc.nextLine();
    }

    void logic()
    {
      int i,j=0;char c,d;
      i=str1.length()-1;

      while(str1.charAt(i)!=' ')
      {
         i--;
      }

      while(j<i)
      {
        if(j==0)
        {
          System.out.print(str1.charAt(j)+".");
        }
        else
        {
          c=str1.charAt(j);
          d=str1.charAt(j+1);
          if(c==' ' && d!=' ')
          {
            System.out.print(d+".");
          }
        }
        j++;
      }
      System.out.print(str1.substring(i));
    }
}


public class shortn
{
    public static void main (String []args)
    {
      name aa = new name();
      aa.getdata();
      aa.logic();
    }
}