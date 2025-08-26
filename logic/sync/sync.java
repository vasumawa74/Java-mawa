package logic.sync;
//understanding the concept of synchronization


class printing
{
    synchronized void print(char ch)  //remove keyword here to see the difference
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
            }
        System.out.println(); 
        }
    }
}

class A extends Thread
{
    printing p;       //in order to use the resources of class printing, we are creating an object for the class
    
    A(printing p)  //here A is a constructor with argument=object
    {
        this.p=p;  //"this" is a pointer that denotes the current class
    }

    public void run()
    {
        p.print('*');  //print is a function inside the printing class
    }
}

class B extends Thread
{
    printing p;    
    B(printing p)
    {
        this.p=p;
    }

    public void run()
    {
        p.print('#');
    }
}

class sync
{
    public static void main (String[] args)
    {
        printing aa=new printing();
        A threadA=new A(aa);
        B threadB=new B(aa);
        threadA.start();
        threadB.start();
    }
}