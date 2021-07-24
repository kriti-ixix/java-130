import java.io.*;
import java.util.*;

class Arraylist{
public static void main(String[] args)
{
 
    ArrayList<String> cars= new ArrayList<String>();
    cars.add("volvo");
 cars.add("bmw");
cars.add("ford");
cars.add("enova");

 
       System.out.println(cars);
 String a;
a=cars.get(2);
System.out.println(a);
cars.set(0, "mercedes");
System.out.println(cars);
cars.remove(2);
System.out.println(cars);
cars.clear();
System.out.println(cars);
cars.add("swift");
cars.add("volvo");
cars.add("scorpio");
System.out.println(cars);
    }
}