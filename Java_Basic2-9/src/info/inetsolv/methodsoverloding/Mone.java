package info.inetsolv.methodsoverloding;

public class Mone {

	public Mone() {
		System.out.println("Mone()");
	}
	 
	    // Overloading method
	    @SuppressWarnings("unused")
		public Float sum(Integer a, Float b) {  
	    	 float z;
			 System.out.println(z=a+b);
	    	//Not valid; Compile time error
	        return a + b;
	    }
}
