package Understanding_enum;
//An enum is a way to create a list of fixed values that a variable can have. Here we are using if condition to give output

enum Status {entry , dahi , chawal , mustard , exit;} //named constant

public class ifenum
{
 public static void main (String [] args)
 {
   Status s = Status.dahi;  // providing the status 
   
   if(s == Status.entry)
   {
   System.out.println("WELCOME");
   }
   else if(s== Status.chawal)
   {
    System.out.println("Chawal added to cart");
   }
    else if(s== Status.dahi)
   {
    System.out.println("Dahi added to cart");
   }
   else if(s== Status.mustard)
   {
    System.out.println("Mustard added to cart");
   }
   else if(s== Status.exit)
   {
    System.out.println("Thank You!!! \nVisit again");
   }
}   
}
