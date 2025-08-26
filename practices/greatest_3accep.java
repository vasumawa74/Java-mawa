package practices;
import java.util.Scanner;

public class greatest_3accep
 {
    public static void main(String[] args)
    {
       int x ,y,z;
      Scanner gr = new Scanner(System.in);

      System.out.print("TO check which is the greatest amoung three numbers");

    System.out.println();

      System.out.print("Enter first number: ");
      x=gr.nextInt();
      System.out.print("Enter Second number: ");
      y=gr.nextInt();
      System.out.print("Enter Third number: ");
      z=gr.nextInt();

       if(x>y && x>z)
              {
                System.out.println("The greater number is x= " +x);
              }
        else if (y>z)  //we dont do this (y>x &&) as this cond is checked in the prev condition of x  
              {
                System.out.println("The greater number is y= " +y);
              }
        else
              {
                System.out.println("The greater number is z= " +z);
              }

    gr.close();

    }
}
