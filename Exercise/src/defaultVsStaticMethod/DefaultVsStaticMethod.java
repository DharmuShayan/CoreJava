package defaultVsStaticMethod;

public class DefaultVsStaticMethod implements Inter{
	
	public static void methodA() {
		System.out.println(" DefaultVsStaticMethod Static method");
	}
	

	
	public static void main(String[] args) {
	
		//DefaultVsStaticMethod defaultVsStaticMethod=new DefaultVsStaticMethod();
	             Inter.methodA();
	             Inter.methodA();	
	             DefaultVsStaticMethod.methodA();
	             DefaultVsStaticMethod.methodA();

	}

}
