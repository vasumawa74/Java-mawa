package logic;
//string buffer class functions

import java.util.Scanner;

class strbuffer
{
    public static void main(String args[])
    {
        StringBuffer str = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:");
        str.append(sc.nextLine()+" ----Append function");

        str.setCharAt(3, 'u');
        System.out.println(str+" ----setcharAt function");

        str.insert(3, "ABCD");
        System.out.println(str+" ----insert function");

        str.setLength(20);
        System.out.println(str+" ----set length function");
        sc.close();
    }
}
