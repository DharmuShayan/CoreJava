package info.inetsolv.collection;
import java.util.HashMap;


class SetDemo{
	public static void main(String[] args) {
		
		HashMap<Object, Object> map = new HashMap<>();
	        map.put(10, new Object());
	        map.put(10, new Object());
	        map.put(10, new Object());
	        map.put(10, new Object());
		System.out.println(map.keySet().hashCode());
		System.out.println(map.keySet());
	}
	
	
	
	
}