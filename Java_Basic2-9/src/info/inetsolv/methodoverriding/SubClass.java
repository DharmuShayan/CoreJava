package info.inetsolv.methodoverriding;

public class SubClass extends Kone {

	@Override
	 public Integer sum(Integer a, Integer b) {
	        return a + b;
	    }
	 
	public static void main(String[] args) {
		
		SubClass sc=new SubClass();
		Integer i=sc.sum(40, 90);
		
		System.out.println(i);
		System.out.println();
	}

}
