package logic;
//method overriding
/*
 *   when there is same name function 
 *  then when calling this function the derived class function
 *  will be called and not the base calss function
 * 
 *   i.e The derived class function overides the base class function  
*/


class A 
{
    void fun()
    {
        System.out.println("HI THIS IS VASU");
    }
}

class B extends A
{
    void fun()
    {
        System.out.println("THIS IS METHOD OVERRIDING");
    }
}

public class overr 
{   public static void main (String []args)
    {
    B aa = new B();
    aa.fun();
}
}