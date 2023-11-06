package LAB07_SET;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class MyWordCount {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> re = new ArrayList<>();
		for(String w : words) {
			WordCount wc = new WordCount(w,count(w) );
			if (!re.contains(wc)) {
				re.add(wc);
			}
		}
		return re;
	}

	private int count(String w) {
		int count =0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).equals(w)) {
				count++;
			}
		}
		return count;
	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	public Set<String> getUniqueWords() {
		Set<String> uniqueWords = new HashSet<>();
		List<WordCount> list = getWordCounts();
		for(WordCount wc : list) {
			if (wc.getCount()==1) {
				uniqueWords.add(wc.getWord());
			}
		}
		return uniqueWords;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
		
		return new HashSet<>(words);
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public  Set<WordCount> printWordCounts() {
		Set<WordCount> res = new TreeSet<>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				
				return o1.getWord().compareTo(o2.getWord());
			}
		});
		res.addAll(getWordCounts());
		return res;
	}

	
	
	public Set<WordCount> exportWordCountsByOccurence() {
		Set<WordCount> res = new TreeSet<>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				if (o2.getCount()== o1.getCount()) {
					return -(o1.getWord().compareTo(o2.getWord()));
				}else {
					return -(o1.getCount() - o2.getCount() );
				}
				
			}
		});
		res.addAll(getWordCounts());
		return res;
	}

	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		  Set<String> res = new HashSet<>();
		  for (String word : words) {
		    if (!word.startsWith(pattern)) {
		    	res.add(word);
		    }
		  }
		  return res;
		}
}


