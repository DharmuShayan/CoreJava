package info.inetsolv.StringJoiner;

import java.util.StringJoiner;

public class Merge_Strings {

	public static void main(String[] args) {
		
		StringJoiner str = new StringJoiner("-");
		str.add("Robin");
		str.add("Raj");
		str.add("Chandan");
		str.add("Kundan");
 
		System.out.println("List of Boys:"+ str);
		
		StringJoiner str1 = new StringJoiner(",");
		str1.add("Bina");
		str1.add("Rima");
		str1.add("Sima");
		str1.add("Simran");
 
		System.out.println("List of Girls:"+ str1);
		
		// using merge()
		StringJoiner string=str.merge(str1);
		System.out.println(string);
		
		// using setEmptyValue()
		StringJoiner str11 = new StringJoiner(",");
		
		str11.setEmptyValue("This is default value:");
		
		System.out.println("Default String: "+str11); 
		
		str11.add("Bina");
		str11.add("Rima");
		str11.add("Sima");
		str11.add("Simran");
		
		System.out.println(str11); 
		
		//using length()
		
		int i=str11.length();
		System.out.println(i);
		
	}

}
