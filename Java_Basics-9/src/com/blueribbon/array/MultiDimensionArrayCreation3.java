package com.blueribbon.array;



public class MultiDimensionArrayCreation3 {

	public static void main(String[] args) {

		int[][] board = { { 4, 5, 2 ,8}, { 36, 78, 13 }, { 89, 34, 78 } };
		for (int i = 0;i<board.length;i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
	
	}

}
