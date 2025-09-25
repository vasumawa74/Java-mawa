package Understanding_enum;

//Enum is a class and it cant be extended

enum laptop
{
    pavillion(500), asus(550) ,macbook(1000) ,XPS(800) , Surface(900);

    private int price;

    private laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {  //you can also pass a value here
        this.price = price;
    }

    private laptop() {
        //default constructor
        price = 399;
    }
   
    

}

public class moreenum 
{
     public static void main (String [] args)
     {
        
        //laptop lap = laptop.macbook;
        // here we cant print price directly as price is private so we use getters & setters
        // System.out.println(lap+ "\tprice =\t"+lap.getPrice());

        laptop[] laps = laptop.values();
        for(int i=0;i<laps.length;i++)
        {
            laptop lap = laps[i];
          System.out.println(lap+":"+lap.getPrice());
        }
    }
}
