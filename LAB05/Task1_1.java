package LAB05;

public class Task1_1 {
	public static int[][] add(int[][] a, int[][] b) {
		int[][] result = new int[a.length] [a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j] ;
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
		int[][] a = {{4,5},{6,8}};
		int[][] b = {{2,4},{9,3}};
		
		printMatrix(add(a, b));
	}
	
}
