package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int i = 0, len = 0, n = s.length();
		char[] A = s.toCharArray();
		Set<Character>  set = new HashSet<Character>();
		for(int j = 0; j < n; j++){
			if(set.contains(A[j])) {
				len = Math.max(j - i, len);
				while(i < n && A[i] != A[j]){
					set.remove(A[i]);
					i++;
				}
				i++;
			}
			else set.add(A[j]);
		}
		return Math.max(len, n - i);
	}
}



