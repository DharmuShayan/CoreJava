package info.inetsolv.staticmethod;

public class StaticMethod {

	public StaticMethod() {

	}

	static int i = 12;
	static {
		methodA();
		
	}

	public static void methodA() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		System.out.println(i);

	}

}
