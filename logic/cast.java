package logic;
public class cast
{
    public static void main(String args[] ) 
    {
         int a = 46;
          //typecasting-1    value of a assigned to l
        byte l = (byte) a;
        System.out.println(l);

        int b = 461;
          //typecasting-2       //the output is -51 as the cast system will %257
        byte m = (byte) b;
        System.out.println(m);

         float c = 6.7f;
         int n = (int)c;
          //typecasting-3      point value is compromised
        System.out.println(n);

        byte o =20;
        byte p =30;
        //type promotion
        int res = o*p;
        System.out.print(res);
    }
}

