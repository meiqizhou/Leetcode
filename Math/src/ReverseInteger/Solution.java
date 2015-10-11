package ReverseInteger;

import java.util.Stack;

public class Solution {
	public int reverse(int x) {
		if(x >= 0) {
			String str = String.valueOf(x);
			String res = reverseString(str);
			long temp = Long.valueOf(res).longValue();
			if(temp > Integer.MAX_VALUE) return 0;
			return Integer.valueOf(res).intValue();
		}
		else{
			String str = String.valueOf(x);
			String res = reverseString(str.substring(1, str.length()));
			long temp = Long.valueOf(res).longValue();
			if(temp > Integer.MAX_VALUE) return 0;
			return 0 - Integer.valueOf(res).intValue();
		}
    }

	private String reverseString(String str) {
		// TODO Auto-generated method stub
		String res = "";
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.substring(i, i + 1));
		}
		while(!stack.isEmpty()) {
			res += stack.pop();
		}
		return res;
	}
}
