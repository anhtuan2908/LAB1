package HOME04;

import java.util.Arrays;

public class Task1_3 {
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j;
			j = i-1;
			while (j >= 0 && array[j] < key) {
				array[j+1] = array[j];
				j= j-1;
			}
					array[j+1] = key;
					System.out.println(Arrays.toString(array));
		}
		
	}
	public static void main(String[] args) {
		int [] array = {23,5,17,74,89,32,67};
		insertionSort(array);
	}
}
