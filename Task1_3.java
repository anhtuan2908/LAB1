package HOME02;

import java.util.Arrays;

public class Task1_3 {
	public static int[] generateNextRow(int[] prevRow) {
		int[] result = new int[prevRow.length+1] ;
		result[0] = 1;
		result[prevRow.length] =1 ;
		for (int i = 1; i < result.length -1 ; i++) {
			result[i] = prevRow[i] + prevRow[i-1] ;
		}
		return result;
	}
	public static int[] getPascalTriangle(int n) {
		if (n==1) {
			return new int[] {1};
		}else {
			int[] prevRow = getPascalTriangle(n-1);
			return generateNextRow(prevRow);
		}
	}

	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			System.out.println(Arrays.toString(getPascalTriangle(i)));
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int[] c = {1,3,3,1};
//		System.out.println(Arrays.toString(generateNextRow(c)));
//		System.out.println(Arrays.toString(getPascalTriangle(3)));
		printPascalTriangle(5);
	}
}
