package HOME02;

public class Task1_1 {
	public static int getSn1(int n) {
		//((-1)^(n+1) ).n
		if (n ==0 ) {
			return 0 ;
		}else {
			return (int) (Math.pow(-1, n+1) * n + getSn1(n-1));
		}
	}
	
	// phuong thuc cong tung giai thua
	public static int getSn2(int n) {
		//1.2.3…n
		if (n ==0) {
			return 0;
		}return giaiThua(n) + getSn2(n-1);
		
		
	}
	public static int giaiThua(int n) {
		if (n ==0) {
			return 1;
		}else {
			return n * giaiThua(n-1);
		}
		
	}
	
	public static int getSn3(int n) {
		if (n == 0 ) {
			return 0;
		}else {
			return (int) Math.pow(n, 2) + getSn3(n-1);
		}
	}
	
	public static int mauso(int n) {
		if (n==0) {
			return 1;
		}else {
			return 2 * n * mauso(n-1);
			
		}
	}
	
	public static double getSn4(int n) {
		if (n==0) {
			return 1;
		}else {
			return (double) 1 / mauso(n) + getSn4(n-1);
		}
		
	}

	
	
	
	public static void main(String[] args) {
		System.out.println("TEST PHUONG THUC 1: " );
		System.out.println(getSn1(4));
		System.out.println("TEST PHUONG THUC 2: " );
		System.out.println(getSn2(4));
		System.out.println("TEST PHUONG THUC 3: " );
		System.out.println(getSn3(4));
		System.out.println("TEST PHUONG THUC 4: " );
		System.out.println(getSn4(5));
	}
}
