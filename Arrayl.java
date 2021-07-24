import java.io.*;
import java.util.*;
class Arrayl{
public static void main(String[] args)
{
    int n=5;  //size of an array
    ArrayList<Integer> arrli=new ArrayList<Integer>(n);
    for(int i=1; i<=n;i++){
        arrli.add(i);
        System.out.println(arrli);
    }
arrli.remove(3);
System.out.println(arrli);
}
}