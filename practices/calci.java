package practices;
import java.util.Scanner;
public class calci 
{
    public static void main(String [] args)
    {
      int x,y,no;
      Scanner cc = new Scanner(System.in);
      System.out.println("Welcome to the choice calculator");
      
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

      System.out.print("Enter first number: ");
      x=cc.nextInt();
      System.out.print("Enter second number: ");
      y=cc.nextInt();
      
      System.out.println("Enter Your Choice of Operation \n1->Add \n2->Sub \n3->MUl \n4->Divide");
      System.out.print("Your choice is: ");
      no=cc.nextInt();

      //now 
      if (no==1)
           {
            System.out.println("\nAddition= "+(x+y));
           }
     else if (no==2)
           {
            System.out.println("\nSubtraction= "+(x-y));
           }
     else if (no==3)
           {
            System.out.println("\nMultiplication= "+(x*y));
           }
     else if (no==4)
           {
            System.out.println("\ndivision= "+(x/y)+ "\n");
           }
     else
           {
            System.out.println("INVALID CHOICE");
           }
    
    cc.close();
    System.out.println("\nTHAnks for using the java calculator");
    }
    }
