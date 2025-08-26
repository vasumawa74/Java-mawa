//Program to understand the file handling in Java:- Writing a file from user input
//import java.io.*; it will slow the program

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class fileHandWU
{
    public static void main(String[] args) 
    {
        try
        {
            String ms = new String();
           FileWriter wrt = new FileWriter("Example 3.txt");
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter your name: ");
           ms=sc.nextLine();
           wrt.write("Your name is: "+ms);
           wrt.close();
           sc.close();
           System.out.println("File created Sucessfully");
        }
        catch(IOException e)
        {
         System.err.println("An Error occured");
         e.printStackTrace();
        }
    }
}
