package logic;
public class logic {
    public static void main(String[] args)
    {   
        int x = 4;
        int y = 6;
        int a = 7;
        int b = 8;

       boolean res1 = x<y && a<b;    // logical AND
       boolean res2 = x>y || a<b;    // logical OR
       boolean res3 = x>y;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(!res3);   //Logical NOT
    }
}
