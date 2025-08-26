package logic;
public  class forloop
 {
    public static void main(String[] args) 
    { 
        for (int i=1 ; i<=5 ; i++)
           {
            System.out.println("DAY " + i);
               for (int j= 9; j<=17;j++)
                 {
                    System.out.println("  "+j + "-" + (j+1));
                    //we can also start j from 1-9 and then in the print statement
                    //do System.out.print((j+8))
                    //this wil increment j
        
                 }
           }
        
    }
}

