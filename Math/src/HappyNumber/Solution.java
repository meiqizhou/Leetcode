package HappyNumber;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	HashSet<Integer> set = new HashSet<Integer>();
	boolean isHappy = false;
	public boolean isHappy(int n) {
		set.add(n);
		int sum = n;
		while(true){
			sum = getSum(sum);
			if(set.contains(sum) && !set.contains(1)) {
				isHappy = true;
				break;
			}
			
			if(sum == 1) {
				isHappy = true;
				break;
			}
			set.add(sum);
		}
		return isHappy;
    }
	private int getSum(int n) {
		int sum = 0;
		String s = String.valueOf(n);
		for(int i = 0; i < s.length(); i++) {
			sum += Math.pow(Integer.valueOf(s.substring(i, i + 1)).intValue(), 2);
		}
		return sum;
	}
}
