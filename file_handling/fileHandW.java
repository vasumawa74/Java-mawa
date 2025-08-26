//Program to understand the file handling in Java:- Writing a file
//import java.io.*; it will slow the program

import java.io.FileWriter;
import java.io.IOException;
public class fileHandW
{
    public static void main(String[] args) 
    {
        try
        {
           FileWriter wrt = new FileWriter("Example 2.txt");
           wrt.write("Hi, This file was created using write() file handling method");
           wrt.close();
           System.out.println("File created Sucessfully");
        }
        catch(IOException e)
        {
         System.err.println("An Error occured");
         e.printStackTrace();
        }
    }
}
