//single level inheritence

import java.util.Scanner;

class A            //base class:- 2 variables and 2 functions
{
   int a,b;
   void input()
   {
     @SuppressWarnings("resource") //to stop resource leak minor error
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number: ");
    a=sc.nextInt();

    System.out.println("Enter 2nd number: ");
    b=sc.nextInt();
   }

   void add()
   {
    System.out.println("Addition = " + (a+b));
   }
   
}

class B extends A  //derived class:- 1 variable and 1 function using base features
{
   int c;
   void getdata()
   {
      @SuppressWarnings("resource") //to stop resource leak minor error
     Scanner dc = new Scanner(System.in);
    System.out.println("Enter 3rd number: ");
    c=dc.nextInt();
   }
   void display()
   {
    System.out.println("Addition= "+(a+b+c));
   }
    
}

public class sinher 
{
     public static void main(String []args)
     {
        B aa=new B();  //derived class ka obj banao
        aa.input();
        aa.getdata();
        aa.display();
     }
}
