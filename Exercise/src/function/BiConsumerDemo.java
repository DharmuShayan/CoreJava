package function;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	//BiConsumer<T,U>

	public static void main(String[] args) {
	
	result((s1,s2)->{
		System.out.println(s1 +"-"+s2);
	});
		
	}

	private static void result(BiConsumer<String, String> consumer ) {
		consumer.accept("Dharmu", "Shayan");
		
	}

}
