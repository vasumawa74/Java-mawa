//anonymous inner class is a class with no name

class A
{
     int age;
    public void show()  //non static method
    {
        age=14;
        System.out.println(age);
    }
}


public class anony
{
    public static void main(String[] args)
    {
        A ab = new A()

        {
         public void show()  //updating values using anonymous in a class
        {
        System.out.println("This is the updated info");
        } 
        };

        ab.show();

    }
}
