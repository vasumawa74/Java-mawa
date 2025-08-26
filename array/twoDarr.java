//introduction to 2D array

import java.util.Scanner;

class two
{
    int rsize,csize;
    int a[][];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size of array: ");
        rsize=sc.nextInt();
        System.out.print("Enter column size of array: ");
        csize=sc.nextInt(); 
        a=new int [rsize][csize];
        int i,j;
        i=j=0;

        for (i=0;i<rsize;i++)
        for(j=0;j<csize;j++)
        {
            System.out.print("enter no: ");
            a[i][j]=sc.nextInt();
        }
    }

    void putdata()
    {
        int i,j;
        i=j=0;
        for (i=0;i<rsize;i++)
        {
          for(j=0;j<csize;j++)
          {
            System.out.print(a[i][j]+"    ");
          }
          System.out.println();
        }
    }

}

public class twoDarr 

{
    public static void main(String[] args)
    {
    two aa = new two();
    aa.getdata();
    aa.putdata();
    }
}
