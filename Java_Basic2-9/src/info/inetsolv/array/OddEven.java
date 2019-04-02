package info.inetsolv.array;

public class OddEven {
	public static void main(String[] args) {
		
		int[] a= {3,10,20,40,50,60,30,10,80};
		for (int i = 0; i < a.length; i++) {
			
			
			if(a[i]%2==0) {
				System.out.println(i+":"+a[i]+"is even");
			}else{
				System.out.println(i+"::"+a[i]+"is odd");
			}
			
		}
		
	}

}
