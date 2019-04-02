package info.inetsolv.string;

public class StringReverse1 {

	public static void main(String[] args) {
	
		StringBuffer sb=new StringBuffer("My Name is :Dharmu").reverse();

		System.out.println(sb);
		
		
		
		String s = " I live in India";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result);
	}

}
