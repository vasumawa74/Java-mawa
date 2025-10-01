package interfaces;

//basic interface understanding

interface area 
{
  final static float pi=3.14F;
  float cal(float x,float y);  //abstract method
}

class rectangle implements area      //implement interface
{
    public float cal(float x,float y)
    {
        return x*y;
    }
}
class circle implements area         //implement interface
{
    public float cal(float x,float y)
    {
        return pi*x*y;
    }
}

public class interfacefunc 
{
    public static void main(String[]args)
    {
       rectangle rect = new rectangle();
        circle cir = new circle();
        area a; //interface object

        a = rect; //reference object for rectangle
        System.out.println("Area of Rectangle = " + a.cal(10, 20));

        a = cir; //reference object for circle
        System.out.println("Area of Circle = " + a.cal(10, 20));
    
    }
}
