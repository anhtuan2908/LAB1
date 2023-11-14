package LAB08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextAnalyzer {
	// <word, its positions>
	public static final String fileName = "data/short";
	private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	// load words in the text file given by fileName and store into map by using add
	// method in Task 2.1.
	// Using BufferedReader reffered in file TextFileUtils.java
	public void load(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = null;
		int index = 1 ;
		while ((line = reader.readLine()) != null ) {
			StringTokenizer tokens = new StringTokenizer(line, " ");
			while (tokens.hasMoreTokens()) {
				String word = tokens.nextToken();
				if (!tokens.hasMoreTokens()) {
					add(word, -index);
				}else {
					add(word, index);
				}
				index++;
			}
			
		}
			reader.close();
			
			
		
	}
	// In the following method, if the word is not in the map, then adding that word
	// to the map containing the position of the word in the file. If the word is
	// already in the map, then its word position is added to the list of word
	// positions for this word.
	// Remember to negate the word position if the word is at the end of a line in
	// the text file

	public void add(String word, int position) {
		if (map.containsKey(word)) {
			ArrayList<Integer> values = map.get(word);
			values.add(position);
			
		}else {
			ArrayList<Integer> values =  new ArrayList<Integer>();
			values.add(position);
			map.put(word, values);
		}
	}

	// This method should display the words of the text file along with the
	// positions of each word, one word per line, in alphabetical order
	public void displayWords() {
		TreeMap< String, ArrayList<Integer>> treeMap = new TreeMap<String, ArrayList<Integer>>(map);
		for (Map.Entry<String, ArrayList<Integer>> entry : treeMap.entrySet()) {
			String key = entry.getKey();
			ArrayList<Integer> val = entry.getValue();
			System.out.println(key + " " + val);
		}
		
	}

	// This method will display the content of the text file stored in the map
	public void displayText() {
		   
		   for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			String key = entry.getKey();
			ArrayList<Integer> val = entry.getValue();
			System.out.println(key + " " + val);
		}
	}

	// This method will return the word that occurs most frequently in the text file
	public String mostFrequentWord() {
		String mostFrequent = null;
		int maxFrequency = 0;

		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			int frequency = entry.getValue().size();
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
				mostFrequent = entry.getKey();
			}
		}
		return mostFrequent;
	}
	public static void main(String[] args) throws IOException {
		TextAnalyzer te = new TextAnalyzer();
		te.load(fileName);
//		te.add("Tuan", 0);
//		te.displayWords();	
//		System.out.println("--------------------");
		te.displayText();
		System.out.println(te.mostFrequentWord());
	}
}

