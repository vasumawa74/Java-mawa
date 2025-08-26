package logic;
//static member function & constructor

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
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\nRoll num.= "+roll+"\nName= "+name+"\nCollege name= "+college);
}

static void change()
{
    college="D.Y. Patil pimpri";
}
}

public class  stustatic
{
    public static void main(String []args)
    {
       bob a1= new bob(101, "Ram");
        bob a2= new bob(102, "Ravi");
        a1.display();
        a2.display();

        bob.change();

        a1.display();
        a2.display();

    }
}
