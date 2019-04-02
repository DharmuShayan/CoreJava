package unmodifiableMap;

import java.util.Map;

public class UnmodifiableMap {

	public static void main(String[] args) {
		
		Map<String, Long> age = Map.of("Bruce", 59L, "Steve", 61L, "Dave", 60L,
                "Adrian", 60L, "Janick", 60L, "Nicko", 65L);
		
		System.out.println(age);
		
		
		Map<String, Long> age1 = Map.ofEntries(Map.entry("Bruce", 59L),
                Map.entry("Steve", 61L),
                Map.entry("Dave", 60L),
                Map.entry("Adrian", 60L),
                Map.entry("Janick", 60L),
                Map.entry("Nicko", 65L));
		
		age1.forEach((k,v) -> {System.out.println("Key = " + k + 
                ", Value = " +v);});
	}

}
