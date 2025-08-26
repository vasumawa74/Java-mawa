//sum of array

import java.util.Scanner;

public class sumarr 
  {  
    public static void main(String []args)
    {
        int size,sum=0;
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        size=sc.nextInt();
        int a[]= new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter number : ");
            a[i]=sc.nextInt();
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\nThe sum of array is:\n");

        for(int i=0;i<size;i++)
        {
            sum=sum+a[i];
           
        }
          System.out.print("Sum= "+sum);
        sc.close();
    }
  }
