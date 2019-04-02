package info.inetsolv.string;

import java.util.StringTokenizer;



public class StringDemo {
	public static void main(String[] args) {
		
		//Method 1 using StringTokenizer
        String str = "I am sample string and will be tokenized on space";
        StringTokenizer defaultTokenizer = new StringTokenizer(str);
         
        while (defaultTokenizer.hasMoreTokens()) {
            System.out.println(defaultTokenizer.nextToken());
        }
         
        //Method 1 using StringTokenizer - with multiple tokens
        String url = "//howtodoinjava.com/java-initerview-questions";
         
        StringTokenizer multiTokenizer = new StringTokenizer(url, "://.-");
        while (multiTokenizer.hasMoreTokens())
        {
            System.out.println(multiTokenizer.nextToken());
        }
         
       
         
       
         
    
	}

}
