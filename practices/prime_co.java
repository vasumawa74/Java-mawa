package practices;
import java.util.Scanner;

class obb
{
    int x; //class variables:- input variable
    void getdata()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter no: ");
        x=ab.nextInt();
        ab.close();

    }
    void putdata()
    {
        int i, count=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if (count==2)  {System.out.println("Prime num");}
        else {System.out.println("no Prime num");}
        
      }
}
public class  prime_co
{
    public static void main(String []args)
    {
       obb a1= new obb();
        a1.getdata();
        a1.putdata();
    }
}