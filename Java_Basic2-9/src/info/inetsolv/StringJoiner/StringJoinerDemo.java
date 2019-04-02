package info.inetsolv.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner sjo=new StringJoiner(",");
		sjo.add("AAkriti");
		sjo.add("Kriti");
		sjo.add("Suman");
		sjo.add("Richa");
		
		System.out.println("List of Girls Name:"+ sjo);
		
		//Adding prefix and suffix to the output String
		
		StringJoiner sj=new StringJoiner(",","(",")");
		sj.add("AAkriti");
		sj.add("Kriti");
		sj.add("Suman");
		sj.add("Richa Chada");
		System.out.println("List of Girls Name:"+ sj);
	}

}
