package com.blueribbon.array;

public class MatrixDemo2 {

	public static void main(String[] args) {
		
		int[][] values = new int[4][4];
		
		for(int i=0;i<values.length;i++) {
			
			for(int j=0;j<values[i].length;j++) {
				
				if (i==j) {
					values[i][j]=1;
				}
				System.out.print(values[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}

}
