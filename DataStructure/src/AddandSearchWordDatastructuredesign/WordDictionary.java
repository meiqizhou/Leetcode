package AddandSearchWordDatastructuredesign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class WordDictionary {
	// Adds a word into the data structure.
	Set<String> set = new HashSet<String>();
    public void addWord(String word) {

    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
		return false;
        
    }
    
    public Set<String> allMathching(String word) {
    	Set<String> contain = new HashSet<String>();
    	List<String> list = new ArrayList<String>();
    	helper(0, word, "", list, contain);
    	return contain;
    }

	private void helper(int start, String word, String s, List<String> list, Set<String> contain) {
	}
}
