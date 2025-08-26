package logic;
import java.util.Scanner;

public class rarea {

    public static void main(String []args)
    {
      int l,b,area,peri;
      Scanner va = new Scanner(System.in);
      System.out.print("Length of Rectangle is: ");
      l = va.nextInt();
      System.out.print("Breadth of rectangle is: ");
      b=va.nextInt();
      area=l*b;
      peri=l+b;
      System.out.println("Area of rectangle is= " + area );
       System.out.println("Perimeter of rectangle is= " + peri );
      va.close();

    }
    
}

