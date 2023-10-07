package HOME01;

import java.util.Iterator;

public class Task2andTask3 {
	public static final char encryptChar(char c, int n ) {
		char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char res = ' ';
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == c ) {
				res = ALPHABET[(i+n)%26];
				
			}
		}
		return res;
	}
	public static char decryptChar(char c, int n) {
		char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char res = ' ';
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == c) {
			res = ALPHABET[(i-n+26)%26];
			}
		}
		return res;
	}
	
	public static String encryptString(String k, int n) {
		char m =  ' ' ;
		char[] ALPHABET = new char[26];
		char[] alphabet = new char[26];
		char[] number	= new char[10];
		
		
		for (int i = 0; i < ALPHABET.length; i++) {
			ALPHABET[i] = (char) ('A'+ i);
		}	
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('a'+ i);
		}
		for (int i = 0; i < number.length; i++) {
			number[i] = (char) ('0'+ i);
		}
		String result = "";
		for (int i = 0; i < k.length(); i++) {
			m=k.charAt(i);
			if (m >= 'a' && m <= 'z') {
				for (int j = 0; j < alphabet.length; j++) {
					if (alphabet[j] == m ) {
						result += alphabet[(j+n)%26];
					}
				}
			}else if (m >= 'A' && m <= 'Z') {
				for (int j = 0; j < ALPHABET.length; j++) {
					if (ALPHABET[j] == m ) {
						result += ALPHABET[(j+n)%26];
					}
				}
			}else if (m >= '0' && m <= '9') {
				for (int j = 0; j < number.length; j++) {
					if (number[j] == m) {
						result += number[(j+n)%10];
					}
				}
			}if (m == ' ') {
				result+= " ";
			}
		}	
		return result;	
	}
		
	
	
	
	public static void main(String[] args) {
		char c = 'E';
		char c1 = 'K';
		String h = "Tuan DepTrai 123";
		System.out.println(encryptChar(c, 3));
		System.out.println(decryptChar(c1, 3));
		System.out.println(encryptString(h, 3));
	}
}
