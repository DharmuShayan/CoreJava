package info.inetsolv.interfaces;

public interface Eone {

	public static final int i = 10;
	
	private void methodB() {
    this.methodA();
	}

	abstract void methodA();

	default void methodS() {

	}
	// can't have
//	static {	
//	}
}
