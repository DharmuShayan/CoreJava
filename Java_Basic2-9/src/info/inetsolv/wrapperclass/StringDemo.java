package info.inetsolv.wrapperclass;



public class StringDemo {

	public static void main(String[] args) {
		
		String str=new String(" 1+2*30-20");
		
		for(int i = str.length() - 1; i >= 0; i--) {
           char c=str.charAt(i);
           System.out.print(c);
           
		}
		
		

		
		
	}

}
