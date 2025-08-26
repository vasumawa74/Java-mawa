import java.util.Scanner;


class A            //base class:-
{
   int x,y;
   void input()
   {
     @SuppressWarnings("resource") //to stop resource leak minor error
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number: ");
    x=sc.nextInt();
    System.out.println("Enter 2nd number: ");
    y=sc.nextInt();
   }
   
}

class B extends A  //derived classes:- 
{
   void multiply()
   {
      System.out.println("Multiply = "+ (x*y));
   }
}

class C extends A
{
  void add()
   {
      System.out.println("Addition = "+ (x+y));
   }
}

class D extends A
{
   void divide()
   {
    System.out.println("Division = " + (x/y));
   }
}


public class hierar 
{
     public static void main(String []args)
     { 
       C aa=new C();  //derived class ka obj banao
       B ab = new B();
       D ac = new D();
       System.out.println("ADDITION");
        aa.input();
        aa.add();
      System.out.println("MULTIPLICATION");
        ab.input();
        ab.multiply();
        System.out.println("DIVISION");
        ac.input();
        ac.divide();
     }
}


/*  if you dont want to enter numbers again and again 
 *  form a new class extending A ; For eg: 
 *     class E extends A 
 *      {
 *        void add() 
 *          {
        System.out.println("Addition = " + (a + b));
            }

    void multiply() 
            {
        System.out.println("Multiply = " + (a * b));
            }

    void divide() 
            {
        System.out.println("Division = " + (a / b));
            }
 *      }
 * 
 * then form an object of E to call all functions
*/