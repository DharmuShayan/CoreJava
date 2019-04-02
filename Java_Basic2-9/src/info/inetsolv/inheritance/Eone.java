package info.inetsolv.inheritance;

public interface Eone {
	
	public void methodA();
	
	@SuppressWarnings("unused")
	default void methodA(int a,int b) {
		int z;
		System.out.println( z=a+b);
	}

}
