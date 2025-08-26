//Program to understand the file handling in Java:- Creating a file
//import java.io.*; it will slow the program
import java.io.File;
import java.io.IOException;
public class fileHand 
{
    public static void main(String[] args) 
    {
        try
        {
            File myObj = new File("Example.txt");  //file is a predefined class
            if (myObj.createNewFile())
            {
                System.out.println("File created "+myObj.getName());
            }
            else
            {
                System.out.println("File already Exists ");
            }
        }
        catch(IOException e)
        {
          System.out.println("An error occured");
          e.printStackTrace();  //it shows line number in which error occured
        }
    }
}
