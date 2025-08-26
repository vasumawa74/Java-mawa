//command line arguments for unknown number of inputs(Addition of n numbers)

public class cmdline2 
{
    public static void main (String args[])
    {
        int len,sum=0;
        len=args.length;
       
        for(int i=0;i<len;i++)
        sum+=Integer.parseInt(args[i]);

        System.out.println("sum="+sum);
    }
}