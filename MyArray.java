import java.util.Arrays;

public class MyArray {
	public int[] arr ;
	public MyArray(int[] arr) {
		super();
		this.arr = arr;
	}
	public int[] miror() {
		int[] result = new int [this.arr.length*2];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
			
		//result[i]= arr.length-1-i;
		result[arr.length* 2 -1 - i] = arr[i];
			
		}
		return result;	
	}
		
	public int[] removeDuplicates() {
		int value = 0;
		int[] result = new int[arr.length];
		int[] sm = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean check = false;
			for (int j = 0; j < value	; j++) {
				if(arr[i] == arr[j]) {
					
				
				check = true;
				break;
				}
			}
		if (!check) {
			
			result[value] = arr[i];
			value++;
			}
		}
		int [] finalResult = Arrays.copyOf(result, value);
			return finalResult;
		
		
		
	}
	
	public static void main(String[] args) {
		int [] arr1= {1,2,3};
		int	[] arr2 = {1,3,5,1,3,7,9,8};
		MyArray ma = new MyArray(arr1);
		MyArray ma2 = new MyArray(arr2);
		int[] test = ma.miror();
		int[] test2 = ma2.removeDuplicates();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(test2));
		
	}
	
}
