package com.blueribbon.bytes;

public class ByteWithNewOprator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Byte b1 = new Byte("127");
		Byte b2 = new Byte("127");
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		Byte b5 = new Byte("12");
		Byte b6 = new Byte("12");
		
		System.out.println(b5==b6);
		System.out.println(b5.equals(b6));
		
		Byte b3 = new Byte("-129");
		Byte b4 = new Byte("-129");
		
		System.out.println(b3==b4);
		System.out.println(b3.equals(b4));
		
	
	}

}
