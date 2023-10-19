package HOME04;

import java.util.Arrays;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp ;
					
				}
			}
			System.out.println(Arrays.toString(array));
		}	
		
	}
	public static void main(String[] args) {
		int [] array = {23,5,17,74,89,32,67};
		bubbleSort(array);
	}
}
