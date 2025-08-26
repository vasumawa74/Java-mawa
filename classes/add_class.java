import java.util.Scanner;
public class add_class
{
    int x,y;  //class variable

    void getdata()
    {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x=ad.nextInt();
        System.out.print("Enter second number: ");
        y=ad.nextInt();
        ad.close();
    }
    void putdata()
    {
        System.out.println("Addition= " + (x+y));
    }

                /*we can end this class here 
             and enter a new main class to call the function
                         like class exe{---} 
               but in that case the "public static void main"
     function will be in this class :: Hence the java file will be named
                       according to this file i.e exe.java*/

public static void main(String []args)
{
    add_class a1=new add_class();
    a1.getdata();
    a1.putdata();

}


}


