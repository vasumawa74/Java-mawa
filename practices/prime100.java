package practices;
//Java code to find prime numbers between 1-100

public class prime100
{
    public static void main(String []args)
    {
       int i,j,count,total=0;
       System.out.println("The prime num.s between 1&100 are= ");
       for(i=1;i<=100;i++)
       {  
        //here i=1,2,3,4,...,100 so we have to check i
          count=0; //reset count=0
           for(j=1;j<=i;j++) //to check i we use another var J
           {
            
            if(i%j==0){count++;} //if the remainder of i/j=0 (completely divisible)
           }
        if(count==2)
        {
            System.out.println(i);
            total++;
        }
       }
       System.out.println("Total prime numbers are: " + total);
    }
}
