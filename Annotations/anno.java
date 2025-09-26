package Annotations;

//annotations are extra information given to the compiler at the runtime

@Deprecated // soon to be removed
class A
{
   public void showTheDataWhichBelongsToThisClass()//for long names mistakes can happen
   {
    System.out.println("OF CLASS A");
   }
}

class B extends A
{
    @Override  //this is an annotation
    // as the func name is "showTheDataWhichBelongsToThisClass" if i make any mistakes in it it will show me
   public void showTheDataWhichBelongsToThisClass()  //if i want to override this funtion /\
   {
    System.out.println("OF CLASS B");
   }
}

public class anno 
{
    public static void main(String [] args)
    {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
