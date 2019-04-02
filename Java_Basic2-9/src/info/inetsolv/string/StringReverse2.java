package info.inetsolv.string;

public class StringReverse2 {

	public static void main(String[] args) {
	
		String str=new String("I am Dharmu");
		char[] res=str.toCharArray();
		for (int i=res.length -1;i>=0;i--) {
			//System.out.print(res[i]);
		}
		

		
		String s = " I live in India";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " " );
		}
		System.out.println(result);
		
	}

}
