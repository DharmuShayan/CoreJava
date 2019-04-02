package info.inetsolv.StreamTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		
		//String str="+917204375610";
		String str="I have a regret, that i don't have any regret.";
		
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()+":"+ st.countTokens());
			//System.out.print();
		}
		
	}

}
