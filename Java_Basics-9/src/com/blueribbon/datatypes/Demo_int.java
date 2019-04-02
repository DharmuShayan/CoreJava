package com.blueribbon.datatypes;

public class Demo_int {

	public static void main(String[] args) {
		
		int i = -2147483648;
		int i2=2147483647;
		
	
		System.out.println(i);
		System.out.println(i2);
		
		System.out.println("--------");
		int a = 2147483647;
        
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
