//understanding vector class in java

import java.util.*;

class vector
{
    Vector<String> list = new Vector<>();

    void under()
    {         
    list.addElement("mawa"); //adds element at the last of the list
    list.addElement("003");
    list.addElement("flash");
    list.addElement("gopro");
    System.out.println("\nVector elements are: "+list);
    }
    void insert()
    {
         list.insertElementAt("Vasu",0);
         System.out.println("\nUpdated elements are: "+list);
    }
    void sizing()
    {
        System.out.println("\nThe size of the list is "+list.size());
    }
    void remove() //more remove functions include removeElement() ; removeAllElements
    {
        list.removeElementAt(1);
        System.out.println("\nAfter removing element at 1st index\n "+list);
    }
}

public class vectorfunc 
{
    public static void main(String [] args)
    {
      vector aa = new vector();
      aa.under();
      aa.insert();
      aa.sizing();
      aa.remove();
    }
}
