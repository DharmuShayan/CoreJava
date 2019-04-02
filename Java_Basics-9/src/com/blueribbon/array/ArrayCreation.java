package com.blueribbon.array;

public class ArrayCreation {

	public static void main(String[] args) {
		
		// Array Creation First way
		int[] intArray=new int[10];
		intArray[0]=10;
		intArray[1]=10;
		intArray[0]=20;
		intArray[2]=20;
		intArray[3]=10;
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i+":"+intArray[i]);
		}
		System.out.println("-----------");
		
		
		// Array Creation Second way
		int array[]= {23,54,65,135,64};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+":"+array[i]);
		}
		
		
	}

}
