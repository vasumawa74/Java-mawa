package practices;
//static data member & constructor


class bob 
{
 int roll;
 String name;
 static String college="D.Y. Patil"; 
 
 //Constructor

bob(int x , String y)
{
    roll=x;
    name=y;
}
 
void display()
{
  System.out.println("Roll num.= "+roll+"\nName= "+name+"\nCollege name= "+college);
}
}

public class  studata
{
    public static void main(String []args)
    {
       bob a1= new bob(101, "Ram");
        bob a2= new bob(102, "Ravi");
        a1.display();
        a2.display();

    }
}
