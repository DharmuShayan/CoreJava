package info.inetsolv.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {

ArrayList list=new ArrayList(Arrays.asList(10,20,30,40,50));


ArrayList duplist=new ArrayList(list);
duplist.add(72);
System.out.println(list);
}
}