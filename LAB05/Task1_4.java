package LAB05;

import java.util.Iterator;

public class Task1_4 {
	public static int[][] transpose(int[][] a) {
		int row = a[0].length;
		int col = a.length;
		int[][] result = new int[row][col];
		
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[j][i];
			}
		}
		return result;
	}	
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] a = { {06,11},{11,12} }  ;
		printMatrix(transpose(a));
	}
	
}	
