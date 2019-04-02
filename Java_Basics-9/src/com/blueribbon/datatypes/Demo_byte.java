package com.blueribbon.datatypes;

public class Demo_byte {

	public static void main(String[] args) {
		
		byte b = -128;
		byte b2=127;
		
		System.out.println(b);
		System.out.println(b2);
		
		System.out.println("---------");
		
        byte a = 126;
        
        // byte is 8 bit value
        System.out.println(a);
        
        a++;
        System.out.println(a);
         
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
         
        // Looping back within the range
        a++;
        System.out.println(a);

	}

}
