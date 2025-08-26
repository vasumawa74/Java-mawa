package practices;
//palindrome = 525,101,232,etc.
import java.util.Scanner;
public class palin 
{
 public static void main(String []mycode)
 {
    Scanner pa= new Scanner(System.in);
    int n,z,rev=0;
    System.out.print("Enter your number: ");
    n=pa.nextInt();
    z=n;
    while(n>0)
    {
      rev=(rev*10)+n%10;   //reverse formula 
      n=n/10;
    }
  if(rev==z)
  {
   System.out.println("The number " +z + " is a palindrome number");
  }
   else 
   {
    System.out.println("The number " +z + " is not a palindrome number");
   }
   pa.close();
  }
 } 

