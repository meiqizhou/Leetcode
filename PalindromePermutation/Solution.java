package PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, determine if a permutation of the string could form a palindrome.
 * @author lby
 *
 */
public class Solution {
    public boolean canPermutePalindrome(String s) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        for(Character c: map.keySet()) {
            if(map.get(c) % 2 == 1) count++;
        }
        return count < 2;
    }
}
