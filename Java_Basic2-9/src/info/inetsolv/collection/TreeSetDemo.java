package info.inetsolv.collection;
import java.util.*;

public class TreeSetDemo{
@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
public static void main(String[] args){


TreeSet set=new TreeSet();

Integer i1=new Integer(10);
Integer i2=new Integer(30);
Integer i3=new Integer(20);

set.add(i1);
set.add(i2);
set.add(i3);

Iterator i=set.iterator();
while(i.hasNext()){
Object o=i.next();
System.out.println(o);

}

set.forEach(System.out::println);


}
}