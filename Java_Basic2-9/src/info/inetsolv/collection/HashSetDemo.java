package info.inetsolv.collection;

import java.util.*;

public class HashSetDemo{
@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
public static void main(String[] args){


HashSet set=new HashSet();

Integer i1=new Integer(10);
Integer i2=new Integer(11);
Integer i3=new Integer(12);

set.add(i1);
set.add(i2);
set.add(i3);
set.add(null);
set.add(null);
set.add(null);
/*Iterator i=set.iterator();
while(i.hasNext()){
Object o=i.next();
System.out.println(o);

}*/
System.out.println(set.hashCode());
System.out.println(i2.hashCode());
//set.forEach(System.out::println);
set.forEach(System.out::println);

}
}