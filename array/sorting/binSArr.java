//Searching elements in array using Binary search

import java.util.Scanner;

class Binary
{    
    int key,pos,size;
    int a[];
     void getdata()
     {
        @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array: ");
       size=sc.nextInt();
       a=new int[size];

       int i;
       for(i=0;i<size;i++)
       {
         System.out.println("Enter " + (i+1)+" number: ");
         a[i]=sc.nextInt();
       }
       System.out.println("~~~~~~~~~~~~~~~~~~~\nTo find: ");
       key=sc.nextInt();
     }

     void search()
     {
       int i,j,mid,found=0;
       //where 
              i=0;
              j=size-1;
              found=0;
        
        while(i<=j&&found==0)
        {
            mid=(i+j)/2;
              if(a[mid]==key)
              {
                  found=1;
                  pos=mid+1;
              }
              else if(a[mid]>key)
              {
                j=mid-1;
              }
              else
              {
                i=mid+1;
              }
        }

        if(found==1)
        {
            System.out.println("Number found at "+pos+" position");
        }
        else
        {
            System.out.println("Number not found");
        }
     }
}

public class binSArr
{
 public static void main(String []args)
 {
     Binary aa= new Binary();
     aa.getdata();
     aa.search();

 }   
}
