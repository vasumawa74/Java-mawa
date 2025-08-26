package practices;
//to find prime or not
import java.util.Scanner;

public class prime 
{
    public static void main(String []args)
    {
        Scanner pa = new Scanner(System.in);
        int count=0,x;
        System.out.print("Enter number: ");
        x=pa.nextInt();
        
        for(int i=1;i<=x;i++)
        {
            if(x%i==0){count=count+1;}
        }
        if(count==2){System.out.println("It is Prime number");}
        else{System.out.println("Its a composite number");}
       pa.close();
    }
    
}
