package logic.matrix;
//sum of rows and columns

import java.util.Scanner;

class rocol
{
    int i,j,a[][],rsize,csize;
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
            System.out.print("enter "+(i+1)+" number for 1st matrix: ");
            a[i][j]=sc.nextInt();
        }
    }

    void sum()
    {
        int sum=0;
        for(i=0;i<rsize;i++)
        {
          sum=0;
          for(j=0;j<csize;j++)
             {sum=sum+a[i][j];}  /*do a[j][i] for column sum*/
         System.out.println("Sum of "+(i+1)+" row= "+sum);
        }
    }

    void output()
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

public class sumRarr 
{
    public static void main(String []args)
    {
        rocol aa =new rocol();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\nSUM OF ROWS OF MATRIX\n");
        aa.getdata();
        System.out.println("\nThe given matrix is: ");
        aa.output();
        System.out.println();
        aa.sum();
    }
    
}
