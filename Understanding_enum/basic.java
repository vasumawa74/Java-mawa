package Understanding_enum;
//An enum is a way to create a list of fixed values that a variable can have.

enum Status {running , failed , pending , success;} //named constant

public class basic 
{
 public static void main (String [] args)
 {
    int i;
    Status s = Status.success;
    Status[] a = Status.values();
    System.out.println(s); // +"\n"+s.ordinal() to print positions of the named constant
    System.out.println(a[0]);
    System.out.println();

    //to print all values

    for(i=0;i<a.length;i++)
    {
       System.out.println(a[i]+":"+a[i].ordinal());
    }
 }   
}
