package RomantoInteger;

public class Solution {
    public int romanToInt(String s) {
    	int res = 0;
    	String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    	int[] digit = {1, -2, 5, -2, 10, -10, 50, -10, 100, -100, 500, -100, 1000};
    	for(int i = 0; i < s.length(); i++){
    		for(int j = 0; j < roman.length; j++){
    			if(s.substring(i, i + 1).equals(roman[j])) res += digit[j];
    		}
    	}
    	for(int i = 1; i < s.length(); i++){
    		for(int j = 0; j < roman.length; j++){
    			if(s.substring(i - 1, i).equals(roman[j])) res += digit[j];
    		}
    	}
    	return res;
    }
}
