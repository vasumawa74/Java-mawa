package logic.input_output;
import java.util.Scanner;

public class accep {

    public static void main(String []args)
    {
      int a,b,sum;
      Scanner va = new Scanner(System.in);
      System.out.println("First number is: ");
      a = va.nextInt();
      System.out.println("Second number is: ");
      b=va.nextInt();
      sum=a+b;
      System.out.println("addition is= " + sum );
      va.close();

    }
    
}
