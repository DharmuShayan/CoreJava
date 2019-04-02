package com.blueribbon.array;

public class MatrixDemo {

	public static void main(String[] args) {
		
		int[][] values= {{12,43,65,23,8},{13,64,21,78},{23},{89,21,56,78}};
		//System.out.println(values.length);    4
	
		for(int i=0;i<values.length;i++) {
			
			for(int j=0;j<values[i].length;j++) {
				
				System.out.print(values[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}

}
