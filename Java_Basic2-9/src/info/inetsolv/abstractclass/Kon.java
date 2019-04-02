package info.inetsolv.abstractclass;

public abstract class Kon {
	
	public int h=12;
	private static final int i=10;

	public abstract void methodA();
	
	//concrete method
	@SuppressWarnings("unused")
	private void methodB() {
		this.methodD();
	}
	//private abstract void methodB();
	protected abstract void methodC();
	 abstract void methodD();
	 
	 @SuppressWarnings("unused")
	private void methodE() {}
	 
	 public abstract void methodQ();
}
