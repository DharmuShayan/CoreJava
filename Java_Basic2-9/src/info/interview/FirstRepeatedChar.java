package info.interview;

import java.util.Scanner;

public class FirstRepeatedChar {

	
	
	Scanner in = new Scanner( System.in);     
	public static void main(String[] args)  {
		FirstRepeatedChar frc = new FirstRepeatedChar();
		frc.mainLoop();
	}
    void mainLoop() {
        String str = " ";
        System.out.println("Please enter a string: ");
        str = in.next();
       
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int firstIndex = str.indexOf(character);
            int lastIndex = str.lastIndexOf(character);
            if(firstIndex != lastIndex) {
                System.out.println("The character '"+character+"' is repeated");
                break; 
            }
        }
    }
}
