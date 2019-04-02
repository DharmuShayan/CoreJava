package info.interview;

public class StringReverseDemo {

	public static void main(String[] args) {
		
		
		
		// Type 111
		String str=new String("1+2*3-20");
        char[] re=str.toCharArray();
        for(int i=re.length - 1;i>=0;i--) {
        	System.out.print(re[i]);
        }
        
        System.out.print("-----" + "----");
        
        
        //Type 222
	String str1=new String(" Hello String");
		
		for(int i = str1.length() - 1; i >= 0; i--) {
           char c=str1.charAt(i);
           System.out.print(c);
           
		}

	}

}
