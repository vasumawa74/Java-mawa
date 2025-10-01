package interfaces;

/*
 * Basically there are 3 types of interfaces:-
 * ->Normal interface
 * ->Functional interface (S.A.M.)
 * ->Marker interface
*/

interface ABC     //--> Normal interface
{
    int subs=56;
  public void sush();
  public void grey();
}

interface SAM     //--> Single Abstract Method interface/functional
{
  public void greens(); // only one function
}

interface make     //--> Marker interface
{
    //empty interface , temp storage to Deserialization old storage (google krle meaning)
}

public class moreinterface3 
{
 public static void main(String []args)
 {

 }   
}
