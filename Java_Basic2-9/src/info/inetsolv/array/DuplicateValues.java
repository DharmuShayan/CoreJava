package info.inetsolv.array;

public class DuplicateValues {

	public static void main(String[] args) {
	
		int a[]= {10,50,70,80,40,50,50,06,10,20,30,10,20,-10};
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j] && i!=j) 
					
			System.out.println(i+":"+a[j]);
				
				
			}
			
		}
 
	}

}
