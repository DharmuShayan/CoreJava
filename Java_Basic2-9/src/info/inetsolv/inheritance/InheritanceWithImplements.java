package info.inetsolv.inheritance;

public class InheritanceWithImplements implements Etwo,Eone {

	public InheritanceWithImplements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eone e=new InheritanceWithImplements();
		e.methodA(10, 20);
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA(int a, int b) {
		// TODO Auto-generated method stub
		Etwo.super.methodA(a, b);
	}




}
