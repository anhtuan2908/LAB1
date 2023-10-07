package HOME01;

import java.util.Iterator;

public class Task2 {
		public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 
				'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		private int n;
		public Task2(int shiftSteps) {
			this.n = shiftSteps;
		}
		public char encryptChar(char c) {
			char res = ' ';
			for (int i = 0; i < ALPHABET.length; i++) {
				if (c == ALPHABET[i]) {
					res = ALPHABET[(i+n)%26];
				}
			}
			return res;
		}
		public String encrypt(String input) {
			String res= "";
			char ch = ' ';
			for (int i = 0; i < input.length(); i++) {
				ch= input.charAt(i);
				for (int j = 0; j < ALPHABET.length; j++) {
					if (ch == ALPHABET[j]) {
						res += encryptChar(ch);
					}else if (ch == ' ') {
						res += " ";
					}
				}
			}
			return res;
		}
		public char decryptChar(char c) {
			char res = ' ';
			for (int i = 0; i < ALPHABET.length; i++) {
				if (c == ALPHABET[i]) {
					res = ALPHABET[(i-n+26)%26];
				}
			}
			return res;
		}
		
		public String decrypt(String input) {
			String res = "";
			char ch = ' ';
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				for (int j = 0; j < ALPHABET.length; j++) {
					if (ch == ALPHABET[j]) {
						res += decryptChar(ch);
					}else if (ch == ' ') {
						res += " ";
					}
				}
			}
			return res;
		}
			
		
		
		public static void main(String[] args) {
			int n =3 ;
			char t = 'K';
			String s = "TUAN DEP TRAI";
			Task2 t1 = new Task2(n);
			Task2 t2 = new Task2(n);
			System.out.println(t1.encryptChar(t));
			System.out.println(t2.encrypt(s));
			System.out.println(t1.decryptChar(t));
			System.out.println(t2.decrypt(s));
		}
}
