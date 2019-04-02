package WithoutLambda;

public class Test {

	public void greet(Greeter greeter) {
		greeter.perfom();
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		Greeting greeting = new Greeting();
		t.greet(greeting);
		
	}

}
