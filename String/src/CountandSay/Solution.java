package CountandSay;

public class Solution {
    public String countAndSay(int n) {
    	int count = 1; 
    	String s = "1";
    	while(count < n) {
    		s = next(s);
    		count++;
    	}
    	return s;
    }

	public String next(String s) {
		int start = 0, N = s.length(), count = 1;
		String res = "";
		if(N == 1) {
			res = 1 + s;
			return res;
		}
		while(start < s.length() - 1) {
			if(s.charAt(start) == s.charAt(start + 1)) {
				start++;
				count++;
				if(start == s.length() - 1) {
					res += count + s.substring(start, start + 1);
					break;
				} 
			}
			else {
				res += count + s.substring(start, start + 1);
				start++;
				count = 1;
				if(start == s.length() - 1) {
					res += count + s.substring(start, start + 1);
					break;
				}
			}
		}
		return res;
	}
}
