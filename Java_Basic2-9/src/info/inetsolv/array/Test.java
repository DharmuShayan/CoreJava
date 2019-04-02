package info.inetsolv.array;

public class Test {
	public static void main(String[] args) {

		Emp e1 = new Emp(10, "Dharmu");
		Emp e2 = new Emp(20, "Shayan");
		Emp e3 = new Emp(30, "Dharmu Shayan");

	Emp[] e = new Emp[5];
		e[0] = e1;
		e[2] = e2;
		e[4] = e3;
		
		
		//Emp[] e= {e1,e2,e3};
		for(Object o:e) {
			
			
			if(o instanceof Emp) {
				
				Emp ee=(Emp)o;
				System.out.println(ee.id+"::"+ee.name);
			}
			
			if(o==null) {
				System.out.println(o);
			}
			
		}

	}
}