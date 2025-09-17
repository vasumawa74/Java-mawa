//inner class is a class inside another class whose object creation is a bit confusing but you must know

class A
{
     int age;
    public void show()  //non static method
    {
        age=14;
        System.out.println(age);
    }

    static class B  //outer class cannot be static
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class inner 
{
    public static void main(String[] args)
    {
        A ab = new A();
        ab.show();
        A.B bb =  new A.B();   /*only for static classes */
         //ab.new B() if non static inner class
        //in order to create an inner class , you need to specify the address where it belongs to 
        bb.config();

    }
}
