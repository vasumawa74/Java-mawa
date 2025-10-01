package interfaces.lambdafun;

//After Java 8 , Functional interfaces cam use Lambda FUnctions to create objects for the functional interfaces
//A lambda function in Java is a short way to write an expression of a functional interface it is given by " ->"

@FunctionalInterface
interface A
{
  public void show(); //(int i)To pass variables in the method and print them
}

public class lamfun 
{
    public static void main (String []args)
    {
       A obj = () -> System.out.println("This is lambda functions "); //if thers only one var. ; in place of (int i) we can also do "i" only
       obj.show();//also pass the value here
    }  
}
