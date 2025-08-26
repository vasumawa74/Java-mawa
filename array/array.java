import java.util.Scanner;

public class array 
  {  
    public static void main(String []args)
    {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter number : ");
            a[i]=sc.nextInt();
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\nYour array is:\n");

        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
  }
