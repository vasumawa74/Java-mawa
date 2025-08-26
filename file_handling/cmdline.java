//command line arguments for known number of inputs (Addition of numbers)

public class cmdline 
{
    public static void main (String[]args)
    {
        int a,b,c;
        a=Integer.parseInt(args[0]);   //two known inputs
        b=Integer.parseInt(args[1]);
        c=a+b;
        System.out.println("Addition= "+c);
    }
}
