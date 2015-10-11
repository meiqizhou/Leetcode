package OneEditDistance;


public class Solution {
    public boolean isOneEditDistance(String s, String t) {
    	if(Math.abs(s.length() - t.length()) > 1) return false;
    	else if(s.length() == t.length()) {
    		return checkWithSameLen(s, t);
    	}
    	else {
    		return checkWithLenDiffOne(s, t);
    	}
    }

	private boolean checkWithLenDiffOne(String s, String t) {
		// TODO Auto-generated method stub
		int count = 0, len1 = s.length(), len2 = t.length();
		int s1 = 0, s2 = 0;
		if(len1 > len2) {
			while(s1 < len1 && s2 < len2) {
				if(s.charAt(s1) == t.charAt(s2)) {
					s1++;
					s2++;
				}
				else {
					s1++;
					count++;
				}
			}
			if(s2 == len2 && s1 == len1 - 1 && count == 0) {
				count++;
			}
			return count == 1;
		}
		else {
			while(s1 < len1 && s2 < len2) {
				if(s.charAt(s1) == t.charAt(s2)) {
					s1++;
					s2++;
				}
				else {
					s2++;
					count++;
				}
			}
			if(s1 == len1 && s2 == len2 - 1 && count == 0) {
				count++;
			}
			return count == 1;
		}
	}

	private boolean checkWithSameLen(String s, String t) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i)) count++;
		}
		return count == 1;
	}
}
