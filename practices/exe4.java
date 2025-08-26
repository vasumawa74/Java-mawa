package practices;
public class exe4 {
    public static void main(String[] args) {
        
       int j=1;
       int k=1;
        
       //for loop
       System.out.print("For loop:");
       for (int i=1;i<=5;i++)
          {
              
              System.out.print(" " + i);
          }
        
        System.out.println();//to move into new line

        //while loop
        System.out.print("While loop:");
        while(j<=5){
            System.out.print(" " + j);
            j++;
        }
         System.out.println();//to move into new line

        //do while
         System.out.print("DoWhile loop:");
        do{
            System.out.print(" " + k);
            k++;
        }while(k<=5);
        }
    }
        