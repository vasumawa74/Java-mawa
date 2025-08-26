package logic.matrix;
//add/sub of two matrix and storing the result in 3rd matrix

import java.util.Scanner;

class matrix
{
    int rsize,csize;
    int a[][];
    int b[][];
    int c[][];
    int d[][];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size of array: ");
        rsize=sc.nextInt();
        System.out.print("Enter column size of array: ");
        csize=sc.nextInt(); 
        a=new int [rsize][csize];
        b=new int [rsize][csize];
        c=new int[rsize][csize];
        d=new int[rsize][csize];

        int i,j;
        i=j=0;

        for (i=0;i<rsize;i++)
        for(j=0;j<csize;j++)
        {
            System.out.print("enter "+(i+1)+" number for 1st matrix: ");
            a[i][j]=sc.nextInt();
        }

        System.out.println();

        for (i=0;i<rsize;i++)
        for(j=0;j<csize;j++)
        {
            System.out.print("enter "+(i+1)+" number for 2nd matrix: ");
            b[i][j]=sc.nextInt();
        }
    }

    /*
    to multiply do this
    void mul()
    {
      int i,j,k;

      for (i=0;i<rsize;i++)
        for(j=0;j<rsize;j++)
        {
            d[i][j]=0;
       for(k=0;k<rsize;k++)

        d[i][j]=d[i][j]+a[i][k]*b[k][j];
       }
       System.out.println("Multiplication of matrix is: ");
       for (i=0;i<rsize;i++)
       {
        for(j=0;j<rsize;j++)
        System.out.print(d[i][j]+"    ");
        System.out.println();
       }
    }*/

    void add()
    {
        int i,j;
        i=j=0;

        for (i=0;i<rsize;i++)
        {
        for(j=0;j<csize;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+"    ");
        }
        System.out.println();
        }
    }

    

    void output()
    {
        int i,j;
        i=j=0;
        System.out.println("First matrix is: ");
        for (i=0;i<rsize;i++)
        {
        for(j=0;j<csize;j++)
        {
            System.out.print(a[i][j]+"    ");

        }
        System.out.println();
        }

        System.out.println("Second matrix is: ");
        for (i=0;i<rsize;i++)
        {
        for(j=0;j<csize;j++)
        {
            System.out.print(b[i][j]+"    ");
        }
        System.out.println();
        }
    }
}

public class oprMatrix 
{
    public static void main(String []args)
    {
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nAddition of matrix:");
       matrix aa= new matrix();
       aa.getdata();
      
       aa.output();
       System.out.println("\nThe resultant array is:\n");
       aa.add();
       /*System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
       aa.getdata();
       aa.mul();
       System.out.println("\nThe product array is:\n");
       aa.output();*/
    }
}
