package logic;
//program to understand basic string fucntions :- length() & CharAt()
import java.util.Scanner;
public class string 
{
    public static void main(String []args)
    {
        int len,i,vol=0,con=0,count=1;
       String str= new String();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name: ");
       str=sc.nextLine();
          sc.close();
       str=str.toUpperCase(); //to make all alphabets capital
       len=str.length();
       for(i=0;i<len-1;i++)
       {
        char a=str.charAt(i);
        char b=str.charAt(i+1);
        if(a==' '&& b!=' ') count++;
       }
       System.out.println("Your name is: "+str+" and your name consists "+count+" words");
       System.out.println("\nIndexing characters below:\n");
       for(i=0;i<len;i++)
       {
        System.out.println(str.charAt(i)+" is at "+(i+1)+" position");
       }

       for(i=0;i<len;i++)
       {
        char c= str.charAt(i);
         if(c!=' ') 
         {
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {vol++;}
            else {con++;}
         }
       }
       System.out.println("\nYour name consists "+vol+" vowels and "+con+" consonants");
    }
    
}
