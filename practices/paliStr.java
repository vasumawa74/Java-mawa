package practices;
//Palindrome string :- racecar,madam,etc

import java.util.Scanner;

class palin
{
    Scanner sc = new Scanner(System.in);
    String str;
    void getdata()
    {
    str = new String();
    System.out.print("Enter string to check: ");
    str=sc.nextLine();
    }

    void logic()
    {
        int i,j,flag;
        i=0;j=str.length()-1;flag=0;  //flag to check if the given word is palindrome or not
         while(i<j && flag ==0)
         {
            if(str.charAt(i)!=str.charAt(j)) 
             {
                flag=1;
             }
        i=i+1;
        j=j-1;
             
         }
        if(flag==0){System.out.println("Given String is a palindrome string");}
        else{System.out.println("Given String is not a palindrome string");}
    }
}


public class paliStr
{
    public static void main (String []args)
    {
      palin aa = new palin();
      aa.getdata();
      aa.logic();
    }
}