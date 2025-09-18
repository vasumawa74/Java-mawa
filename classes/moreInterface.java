//more details about interface function

// class - class -> extends
// class - interface -> implements
// interface - interface  -> extends


interface  A   //we can create an interface A instead of an abstract class if we need a class just to store abstract methods
{
    int pop=53;
     //we can only declare variables if they are final and static


    /*public abstract*/ void show();  // By default all methods of an interface are 'public abstract'
   
}

interface X 
{
   String shush="Susu"; 
    /*public abstract*/ void dim();
}

class B implements A,X     // variables cant be implemented and we can implement many interfaces
{
     public void show()
     {
        System.out.println("This is how we implement interface");
     }
     public void dim()
     {
        System.out.println("This is how interface works");
     }
}

public class moreInterface 
{
    public static void main(String []args)
    {
          A ab = new B(); //we cant create object of interface
          X bb = new B();
          bb.dim();
          ab.show();

          //as the interface variables are final and static ; they can be directly called

          System.out.println("The 1st interface variable is valued at:"+A.pop);
          
          System.out.println("The 2nd interface variable is valued at:"+X.shush);
    }
}
