package practices;
public class exe2 {
    public static void main(String[] args){
     
         int a =20;
         int b =10;
         
         int res = a+b;
         int res1 = a-b;
         int res2 = a*b;
         int res3 = a/b;
         
         boolean var = a>b;
         
         boolean var2 = a>b && b>0;
         
         System.out.println("Addition: "+res);
         System.out.println("Subtraction: "+res1);
         System.out.println("Multiplication: "+res2);
         System.out.println("Division: "+res3);
         
         System.out.println("Is a greater than b? "+var);
         System.out.println("Is a>b and b>0? "+var2);
         
         
    }
}