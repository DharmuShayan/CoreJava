package info.inetsolv.methodsoverloding;



public class MainClass extends Mone {



	public MainClass() {
		System.out.println("MainClass()");
	}

	public void methodA(int i, int j) {
		System.out.println(i+j);
	}

	
	 @SuppressWarnings("unused")
	public Integer sum(Integer a, Integer b) {
		 Integer z;
		 System.out.println(z=a+b);
	       return a + b;
	    
	    }
	 
	public static void main(String[] args) {
	
		
		MainClass k= new MainClass();
		k.sum(50, 80);
		k.sum(20,600.0f);
		
		
/*		Kone k1=new Kone();
		k1.methodA();
		k1.methodA(10);
		k1.methodA(20, 50);*/
        
	}

}
