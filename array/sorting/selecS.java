//Selection sort in java

import java.util.Scanner;

class select
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
        System.out.print("Enter "+(i+1)+" number: ");
        a[i]=sc.nextInt();
     }
   } 

   void sort()
   {
    int i,j,t;
    for(i=0;i<size-1;i++)
     for(j=i+1;j<size;j++)
      {
        if(a[i]>a[j])
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
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

public class selecS 
{
    public static void main(String []args)
    {
       
        System.out.println("ARRAY SORTING USING SELECTION SORT\n~~~~~~~~~~~~~~~~~~~~~~~\n");
        select aa= new select();
        aa.getdata();
        System.out.println("UNSORTED ARRAY IS: ");
        aa.putdata();
        System.out.println("AFTER SORTING ARRAY:");
        aa.sort();
        aa.putdata();
    }
}
