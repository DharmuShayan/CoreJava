package info.inetsolv.methodsoverloding;

public class Kone {

	public Kone() {
		System.out.println("Kone()");
	}

	public void methodA() {
		this.toString();

	}

	 void methodA(int i) {
       System.out.println(i);
	}

	public void methodA(int i, int j) {
		System.out.println(i+j);
	}
}
