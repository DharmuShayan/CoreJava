package info.inetsolv.inheritance;


// Cann't extends multiple classes
public class InheritanceWithExtends extends Kone {

	public InheritanceWithExtends() {
		super();
		this.methodA();
		super.methodA();
		
		
	}

	@SuppressWarnings("unused")
	public void methodA(){
		 int a ,b,z;
		 a=400;
		 b=210;
		
	System.out.println(z=a - b);	
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InheritanceWithExtends iwe=new InheritanceWithExtends();
		

	}

}
