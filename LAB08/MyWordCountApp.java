package LAB08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MyWordCountApp {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";
	// <word, its occurences>
	private Map<String, Integer> map = new HashMap<String, Integer>();

	// Load data from fileName into the above map (containing <word, its occurences>)
	// using the guide given in TestReadFile.java
	
	public void loadData() throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fileName));
		while (sc.hasNext()) {
			String word = sc.next();
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
	}
	
	
	public int countDistinct() {
		return map.size();
	}
	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public void printWordCounts() throws FileNotFoundException {
		
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according to ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public void printWordCountsAlphabet() {
		TreeMap< String, Integer> tree = new TreeMap<String , Integer>(map);
		tree.putAll(map);
		for (Map.Entry<String, Integer> entry : tree.entrySet()) {
		    String word = entry.getKey();
		    Integer count = entry.getValue();
		    System.out.println(word + " " + count);
		  }
	}
	public static void main(String[] args) throws FileNotFoundException {
		MyWordCountApp mwc = new MyWordCountApp();
		mwc.loadData();
		//Testcoudistinct
		System.out.println("Test countDistinct" );
		System.out.println(mwc.countDistinct() );
		
		
		System.out.println("Test printWordCounts");
		mwc.printWordCounts();
		
		System.out.println("Test printWordCountsAlphabet");
		mwc.printWordCountsAlphabet();
	}
}
