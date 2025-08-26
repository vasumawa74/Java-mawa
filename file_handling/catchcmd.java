//catching invalid command line argument:- String input for int

public class catchcmd
{
    public static void main (String[]args)
    {
        int valid,invalid;
        valid=invalid=0;
        for(int i=0;i<args.length;i++)
        {
            try
            {
             int number=Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e)
            {
                invalid++;
                System.out.println("Argument error: "+args[i]);
                continue;
            }
            valid++; 
        }
    System.out.println("\n Valid Input="+valid);
     System.out.println(" Invalid Input="+invalid);
    }
}
