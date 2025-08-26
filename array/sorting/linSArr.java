//Searching elements in array using linear search

import java.util.Scanner;

class Linear
{ 
   int key,pos;
   int a[]=new int [10];                           // forming array
   void getdata()
   {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int i;
    for (i=0;i<10;i++)
      {
        System.out.print("Enter number: ");              //basic inputs
        a[i]=sc.nextInt();
      }
    
    System.out.print("To find: ");
    key=sc.nextInt();
   }

   void search()                        // to search elements we have to stop the search after the element is found;; so we take a variable 'found' which we will use to break the loop
   {
    int i,found=0;
    for(i=0;i<10 && found==0 ; i++)
       {
            if(a[i]==key) 
            {
                found=1;
                pos=i+1;
            }
       }
        if(found==1)
            {
                 System.out.println("~~~~~~~~~~~~~~~~~~~~~\nNumber found at "+ pos+" position");
            }
            else
            {
                System.out.println("Number not found");
            }
   }
}

public class linSArr 
{
    public static void main (String []args)
    {
      Linear aa=new Linear();
      aa.getdata();
      aa.search();
    }
}
