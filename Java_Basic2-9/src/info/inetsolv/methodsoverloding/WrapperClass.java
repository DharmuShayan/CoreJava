package info.inetsolv.methodsoverloding;

public class WrapperClass {
	

	public void methodS(String str) {
		System.out.println("String");
	}

	
	public void methodS(Object obj) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		
		WrapperClass wc=new WrapperClass();
		wc.methodS(10);
		
	}

}
