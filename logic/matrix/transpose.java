package logic.matrix;
/* Mainly there are 3 ways to print the transpose of a matrix:-
 *  (1) by reprinting the same matrix in opposite to print the transpose
 *  (2) by taking a new matrix and printing rows of 1st matrix into the new matrix
 *  (3) by updating the original matrix
 */

import java.util.Scanner;

class trans
{
    int i,j,a[][],rsize,csize;
     void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size of matrix: ");
        rsize=sc.nextInt();
        System.out.print("Enter column size of matrix: ");
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

    void logic()
    {

        for (i=0;i<rsize;i++)
        {
        for(j=0;j<csize;j++)
        {
         System.out.print(a[j][i]+"    "); //if you want to store the transpose in a new matrix; then after initialising b[][];; do b[i][j]=a[j][i]
        }
        System.out.println();

        /*         This is the third way :- Replacing diagonally opposite elements
         *   for (i=0;i<rsize;i++)
             for(j=0;j<csize;j++)
          *   {if (j>i)
                  {t=a[i][j]
                  a[i][j]=a[j][i]
                  a[j][i]=t}
         */
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

public class transpose 
{
    public static void main(String []args)
    {
        trans aa =new trans();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\nTRANSPOSE OF MATRIX\n");
        aa.getdata();
        System.out.println("\nThe given matrix is: ");
        aa.output();
        System.out.println("\nTRANSPOSE:\n");
        aa.logic();
    }
    
}
