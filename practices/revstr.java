package practices;
//to print reverse:- Eg: i am going -- going am i
import java.util.Scanner;

class name
{
    Scanner sc = new Scanner(System.in);
    String str;

    void getdata()
    {
    str = new String();
    System.out.print("Enter Your string: ");
    str=sc.nextLine();
    }

    void logic()
    {
      int i,j,k;
      i=str.length()-1;

     
      while(i>=0)
      {
       j=i;
       while(str.charAt(j)!=' ' && j>0) j--;

       if(j==0)
       {
        k=0;
       }
       else{k=j+1;}

       System.out.print(str.substring(k, i+1)+" ");
       i=j-1;
      }
    }
}


public class revstr
{
    public static void main (String []args)
    {
      name aa = new name();
      aa.getdata();
      aa.logic();
    }
}