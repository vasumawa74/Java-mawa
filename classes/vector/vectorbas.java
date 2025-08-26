//understanding vector class in java

import java.util.*;

class vector
{
    Vector<String> list = new Vector<>();

    void under()
    {         
    list.addElement("mawa"); //adds element at the last of the list
    list.addElement("003");
    System.out.println("Vector elements are: "+list);
    }
    void insert()
    {
         list.insertElementAt("Vasu",0);
         System.out.println("Updated elements are: "+list);
    }
}

public class vectorbas 
{
    public static void main(String [] args)
    {
      vector aa = new vector();
      aa.under();
      aa.insert();
    }
}
