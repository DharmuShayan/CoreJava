package info.inetsolv.staticblock;

class MainClass extends Kone {

	static String s;

	static {
		MainClass obj1 = new MainClass();
		System.out.println("i:" + obj1.i);
	}
	
	public static void main(String args[]) // It's a Static Method
	{
		MainClass obj = new MainClass();
		// Non Static variables accessed using object obj

		// Kone k = new Kone();
		System.out.println("i:" + obj.i);
		System.out.println("s:" + s);
		
	}
}