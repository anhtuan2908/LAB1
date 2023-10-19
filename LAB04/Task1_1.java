package HOME04;

import java.util.Arrays;

public class Task1_1 {
	public static void selectionSort(int[] array) {
		int maxIndex,temp;
		for (int i = 0; i < array.length-1; i++) {
			maxIndex =i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] > array [maxIndex]) {
					maxIndex =j;
				}
			}
				temp = array[maxIndex];
				array[maxIndex] = array[i];
				array[i] = temp;
				System.out.println(Arrays.toString(array));
			}
			
		
	}
	public static void main(String[] args) {
		int [] array = {23,5,17,74,89,32,67};
		selectionSort(array);
	}
}
