package info.inetsolv.array;

public class Addition {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50,60,70,80,90};
		
		
		int total=a[0];
		for (int i = 0; i < a.length; i++) {
			
			total += a[i];
			
		}
		System.out.println("Sum of all :"+ total);
	}

}
