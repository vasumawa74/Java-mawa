//Selection sort in java

import java.util.Scanner;

class bubble
{
   int a[],size;
   void getdata()
   {
    @SuppressWarnings("resource")
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter size of array: ");
     size=sc.nextInt();
     a=new int[size];

     int i;
     for(i=0;i<size;i++)
     {
        System.out.println("Enter "+(i+1)+" number: ");
        a[i]=sc.nextInt();
     }
   } 

   void sort()
   {
     int i,j,t;
     for(i=0;i<size;i++)
     for(j=0;j<(size-1)-i;j++)
     {
        if(a[j]>a[j+1])           //the </> sign changes the order of array from ascending to decending
        {
           t=a[j];
           a[j]=a[j+1];
           a[j+1]=t;
        }
     }
   }

   void putdata()
   {
    int i;
    for(i=0;i<size;i++)
     {
        System.out.println(a[i]);
     }
   }

}

public class bubbleS 
{
    public static void main(String []args)
    {
        System.out.println("ARRAY SORTING USING BUBBLE SORT\n~~~~~~~~~~~~~~~~~~~~~~~\n");
        bubble aa= new bubble();
        aa.getdata();
        System.out.println("\nUNSORTED ARRAY IS: ");
        aa.putdata();
        System.out.println("\nAFTER SORTING ARRAY:");
        aa.sort();
        aa.putdata();
    }
}
