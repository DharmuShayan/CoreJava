package WithLambda;

public class Test {
	
    public void greeting(Greeter greeter) {
    	greeter.perform();
    }
		


	public static void main(String[] args) {
		Test t = new Test();

		
		//With Lamda Expression
		/*Greeter	myLambdaFunction=()->System.out.println("Hello World");
		myLambdaFunction.perform();
		
		t.greeting(myLambdaFunction);*/
		
		
		t.greeting(()->System.out.println("Hello World !"));
		
		
		
		
		/*	    //With inner class
		Greeter innerClass=new Greeter() {
			public void perform() {
				System.out.println("Hello World");
			}
		};
		
		innerClass.perform();
		*/
		
	}

}
