//understanding multiple inheritence using interface
import java.util.Scanner;
class stu
{  
    int roll;
    Scanner sc = new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter roll number of the sutdent: ");
        roll=sc.nextInt();
    }
    void putdata()
    {
        System.out.println("roll= "+roll);
    }
}

class test extends stu
{
    Scanner sc = new Scanner(System.in);
    float mark1,mark2;
    void getmarks()
    {
        System.out.print("Enter marks in mechanics: ");
        mark1=sc.nextInt();
        System.out.print("Enter marks in chemistry: ");
        mark2=sc.nextInt();
    }
    void putmarks()
    {
        System.out.println("Marks1= "+mark1 + "\nMark2= "+mark2);
    }
}

interface sports
{
    float sportmarks=6.0F;
    void putsport(); //abstract method
}

class result extends test implements sports
{
    float total;
    public void putsport()
    {
        System.out.println("Sports marks= "+sportmarks);
    }
    void display()
    {
        total=mark1+mark2+sportmarks;
        putdata();
        putmarks();
        putsport();
        System.out.println("Total marks: "+total);
    }
} 

public class multipleInh 
{
    public static void main(String []args)
    {
      result aa = new result();
      aa.getdata();
      aa.getmarks();
      aa.display();
    }
}
