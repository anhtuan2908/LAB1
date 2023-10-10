package ATSCHOOL;

import java.util.Arrays;
import java.util.Iterator;

public class TASK1 {
	private int[] array;
	public TASK1(int[] array) {
	this.array = array;
	}
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearch(target, 0);
	}
	
	
	public int recursiveLinearSearch(int target, int index) {
		
		if (index == array.length) {
			return -1;
		}else if (array[index] == target) {
			return index;
		}else {
			return recursiveLinearSearch(target, index+1);
		}
	}
	
	
	
	
	public int iterativeBinarySearch(int target) {
		int res = 0;
		int mid = (array.length-1)/2;
		Arrays.sort(array) ;
		if (target == array[mid] ) {
			return res = mid;
		}else if (target > array[mid]) {
			for (int i = mid +1; i < array.length; i++) {
				if (target == array[mid]) {
					return res = i;
				}
			}
		}else {
			for (int i = 0; i < mid; i++) {
				if (target== array[i]	) {
					return res = i;
				}
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		 int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
		 
		 
		 TASK1 t1 = new TASK1(array);
		 System.out.println((t1.iterativeLinearSearch(46)));
		 System.out.println(t1.recursiveLinearSearch(9));
		 System.out.println(t1.iterativeBinarySearch(9));
		 
		 
	}
	
}
