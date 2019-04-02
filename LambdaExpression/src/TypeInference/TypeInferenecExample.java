package TypeInference;

public class TypeInferenecExample {
	
	public static void printlambda(StringLength sl) {
		System.out.println(sl.getLength("Hello"));
	}
	
	
	
	public static void main(String[] args) {
		//StringLength lambda=(String s)->s.length();
		
		//StringLength lambda=s->s.length();
		//System.out.println(lambda.getLength("Hello"));
		
		printlambda(s->s.length());

	}

}
