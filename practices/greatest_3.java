package practices;
public class greatest_3
 {
    public static void main(String[] args)
    {
       int x = 1;
       int y = 7;
       int z = 31;

       if(x>y && x>z)
              {
                System.out.println("The greater number is x= " +x);
              }
        else if (y>z)  //we dont do this (y>x &&) as this cond is checked in the prev condition of x  
              {
                System.out.println("The greater number is y= " +y);
              }
        else
              {
                System.out.println("The greater number is z= " +z);
              }

    }
}
