package HOME01;

import java.util.Arrays;

public class MyArrayHome {
	public static int[] getMissingValues(int[] arr) {
		int[] missingValues = new int[arr.length];
			int n = missingValues.length;
			for (int i = 0; i < arr.length-1; i++) {
				if (!((arr[i] + arr[i+2])/2 == arr[i+1])) {
					missingValues[i+1] =((arr[i] + arr[i+2])/2);
					
				}
			}
			for (int i = 0; i < n; i++) {
				if (missingValues[i] == 0 ) {
					for (int j = i; j < n-1; j++) {
						missingValues[j] = missingValues[j+1];
						
					}
					i--;
					n--;
				}
			}
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			 res[i] = missingValues[i];
		}
		return missingValues;
	}
	
//	public int[] fillMissingValues(int k) {
//		
//	}
//	
	
	
	
	
	
	public static void main(String[] args) {
		 int[] arr1 = { 11, 12, 13 ,14 ,16 ,17, 19, 20 };
		 System.out.println(Arrays.toString(getMissingValues(arr1)));
	}
	
}
