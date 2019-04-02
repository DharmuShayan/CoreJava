package defaultVsStaticMethod;

public interface Inter {
	
	public static void methodA() {
		System.out.println(" Inter Static method");
	}
	
	public default void methodB() {
		System.out.println(" Inter Defalut method");
	}


}
