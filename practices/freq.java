package practices;
//frequency of number in array

import java.util.Scanner;


class array
{
    int key, a[],size;
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
         System.out.print("Enter "+(i+1)+" no: ");
         a[i]=sc.nextInt();
      }
      System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nEnter number to find frequency: ");
      key=sc.nextInt();
      
    }
    void count()
    {
       int i,count=0;
       for(i=0;i<size;i++)
       {
         if(a[i]==key)
         {
            count++;
         }
       }
        System.out.println(key+" is repeated "+count+" times");
    }
}

public class freq
{
  public static void main(String []args)
  {
    array aa = new array();
    aa.getdata();
    aa.count();
  }  
}
