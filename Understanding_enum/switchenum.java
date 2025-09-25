package Understanding_enum;
//An enum is a way to create a list of fixed values that a variable can have. Here we are using switch condition to give output

enum Status {entry , dahi , chawal , mustard , exit;} //named constant

public class switchenum
{
 public static void main (String [] args)
 {
   Status s = Status.dahi;  // providing the status 
   
   switch(s)
   {
    case entry : System.out.println("Welcome !!");
    break;
    case dahi : System.out.println("Dahi is added to the cart");
    break;
    case chawal : System.out.println("Chawal is added to the cart");
    break;
    case mustard : System.out.println("Mustard is added to the cart");
    break;
    case exit : System.out.println("Thank you for shopping!!!");
    break;
    default : System.out.println("How can I Help you?");
   }
}   
}
