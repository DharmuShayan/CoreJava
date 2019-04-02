package info.inetsolv.wrapperclass;

public class BooleanDemo {

	public static void main(String[] args) {
		
		
		Boolean b1=true;
		Boolean b2=false;
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
		
		Boolean b3 = new Boolean(true);
		Boolean b4 = new Boolean(true);
		
		System.out.println(b3==b1);
	}

}
