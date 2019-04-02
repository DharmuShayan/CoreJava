package info.interview;


 

 
public class PermutationDemo {
 
	public static void main(String args[]) {
	    permuteString("", "ABC");
	  }

	  public static void permuteString(String beginningString, String endingString) {
	    if (endingString.length() <= 1)
	      System.out.print(beginningString + endingString +"\n");
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

	          permuteString(beginningString + endingString.charAt(i), newString);
	        } catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	  }
}