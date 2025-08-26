package practices;
import java.util.Scanner;

public class switchcal
{
    public static void main(String[] args)
    {  
        int x,y,ch;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~");
        System.out.println("Welcome to switch case calci");
        System.out.println("~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~");

        System.out.print("Enter first no: ");
        x=sc.nextInt();

        System.out.print("Enter second no: ");
        y=sc.nextInt();

        System.out.print("Enter your choice of operation:  \n1)Add\n2)Sub\n3)Mul\n4)Div\nEnter your choice: ");
        ch=sc.nextInt();

          //switch
          switch(ch)
          {
            case 1: System.out.println("Addition: " + (x+y));break;
            case 2: System.out.println("Subtraction: " + (x-y));break;
            case 3: System.out.println("Multiplication: " + (x*y));break;
            case 4: System.out.println("Division: " + (x/y));break;
            default: System.out.println("Invalid choice ");break;
          }
       sc.close();
    }
}
