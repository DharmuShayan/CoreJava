package info.inetsolv.equals;

public class MainClass {

	public static void main(String[] args) {
		
		Kone k=new Kone();
		Kone k1=new Kone();
		k=k1;
		Ktwo k2=new Ktwo();
		
		System.out.println(k.equals(k2));
		//System.out.println(k==k2);
		System.out.println(k1==k);
		System.out.println(k1.hashCode());
		System.out.println(k.hashCode());
		//System.out.println(Runtime.getRuntime().totalMemory());
		
		
	}
}
