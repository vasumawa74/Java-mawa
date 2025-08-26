//insersion sort in java

import java.util.Scanner;

class insersion
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
     int i,temp,j;
     for(i=0;i<size;i++)
     {
       temp=a[i];
       j=i-1;

       while(j>=0 && temp<a[j])   //(j>0) just in case when element is shifted to '0th' place
       {
         a[j+1]=a[j];
         j--;
       }
       a[j+1]=temp;
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

public class InserS
{
    public static void main(String []args)
    {
        System.out.println("ARRAY SORTING USING INSERSION SORT\n~~~~~~~~~~~~~~~~~~~~~~~\n");
        insersion aa= new insersion();
        aa.getdata();
        System.out.println("\nUNSORTED ARRAY IS: ");
        aa.putdata();
        System.out.println("\nAFTER SORTING ARRAY:");
        aa.sort();
        aa.putdata();
    }
}
