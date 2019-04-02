package com.blueribbon.doubles;

public class DoubleWithNewOperator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Double d1 = new Double(10.23d);
		Double d2 = new Double(10.23d);
		Double d3 = new Double(11.23f);
		//Double d4 = new Double(10.23);
		Double d5 =10.23;
		
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1==d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1==d5);
		System.out.println(d1.equals(d5));
	}

}
