package interfaces;

//For better understanding of functional interfaces -->

//-->S.A.M or Single abstract method function ; For this we use annotations which will give an error if we put more functions in it
@FunctionalInterface
interface A   
{
    void show();
}

// NORMAL WAY -->

//class B implements A
// {
//     public void show()
//     {
//         System.out.println("This is functional Interface");
//     }
// }

public class funcinter 
{
 public static void main(String [] args )
 {
    //anonymous class
    A obj = new A()
    {
         public void show()
      {
           System.out.println("This is functional Interface");
       }
    };
    obj.show();;
 }   
}
