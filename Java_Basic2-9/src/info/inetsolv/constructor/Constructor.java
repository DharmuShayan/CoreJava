package info.inetsolv.constructor;

public class Constructor extends Kone {

	
	 
	private  Constructor() {
		super();  // super keyword must be the 1st statement
		System.out.println("Constructor");
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Constructor cs=new Constructor();
	
	}
}


// NOTE:  Constructors cannot be overridden