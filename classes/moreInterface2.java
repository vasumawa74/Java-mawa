//A good example to understand Interface

interface computer
{
     void code();
}

class laptop implements computer
{
    public void code()
    {
        System.out.println("code , compile , Run");
    }
}

class desktop implements computer
{
    public void code()
    {
        System.out.println("code , compile , Run :: Faster");
    }
}

class Developer
{
    public void app(computer lap)
    {
        lap.code();
        //System.out.println("CODING....--> $Salary$");
    }
}

public class moreInterface2
{
  public static void main(String []args)
  {
      @SuppressWarnings("unused")
      computer lap = new laptop();
      computer desk = new desktop();

      Developer vasu = new Developer();
      vasu.app(desk);
  }    
}
