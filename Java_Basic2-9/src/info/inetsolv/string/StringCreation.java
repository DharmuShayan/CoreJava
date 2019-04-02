package info.inetsolv.string;

public class StringCreation {

	public static void main(String[] args) {

		String str=new String("dharmu");
		String st="dharmu";
		String st1="dharmu";
		
		System.out.println(str==st);
		System.out.println(st.equals(str));
		
		System.out.println(str.hashCode());
		System.out.println(st1.hashCode());
	}

}
