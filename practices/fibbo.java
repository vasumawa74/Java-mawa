package practices;
import java.util.Scanner;
public class fibbo
{
    public static void main(String []args)
    {
       int n,n1=0,n2=1,sum=0;
       System.out.print("Enter max value of fibbonacci series= ");
       Scanner pn=new Scanner(System.in);
       n=pn.nextInt();
       while(sum<=n)
       {
        System.out.println(sum);
         n1=n2;
         n2=sum;
         sum=n1+n2;
    
       pn.close();
       }
    }
}


