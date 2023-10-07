package HOME02;

public class Task1_2 {
	public static int getFibonacci(int n) {
		if (n < 0 ) {
			return 1;
		}else {
			if (n ==0) {
				return 0;
			}
		}
		return (getFibonacci(n -1) + getFibonacci(n -2));
	}
	public static void printFibonacci(int n) {
		System.out.println("Print Fibonacci:    ");
		for (int i = 0; i < n; i++) {
			System.out.print(getFibonacci(i)+ " ");
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(getFibonacci(8));
		System.out.println(getFibonacci(9));
		printFibonacci(8);
	}
}
