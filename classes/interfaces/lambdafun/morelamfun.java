package interfaces.lambdafun;

//Passing values in lambda func ... EG:- adding two numbers

@FunctionalInterface
interface A
{
 int add(int i, int j); //To pass variables in the method and print them
}

public class morelamfun 
{
    public static void main (String []args)
    {
       A obj = (int i,int j) ->  i+j; //in  case of expressions return is not needed
    
       int result = obj.add(30, 04);
       System.out.println("Sum= "+result);
    }  
}
