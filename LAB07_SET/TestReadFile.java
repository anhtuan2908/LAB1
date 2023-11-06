package LAB07_SET;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(new File("data/hamlet.txt"));
		Scanner input = new Scanner(new File("data/fit"));

		while (input.hasNext()) {
			String word = input.next();
			System.out.println(word);
		}
		MyWordCount myTest = new MyWordCount();
		System.out.println("Test phuong thuc get word counts");
		System.out.println(myTest.getWordCounts());
		System.out.println("Test phuong thuc get unique word");
		System.out.println(myTest.getUniqueWords());
		System.out.println("Test phuong thuc get distinct");
		System.out.println(myTest.getDistinctWords());
		System.out.println("Test phuong thuc print word counts");
		System.out.println(myTest.printWordCounts());
		System.out.println("Test phuong thuc export");
		System.out.println(myTest.exportWordCountsByOccurence());
		System.out.println("Test phuong thuc filter words");
		System.out.println(myTest.filterWords("D"));
		
	}
	
}
