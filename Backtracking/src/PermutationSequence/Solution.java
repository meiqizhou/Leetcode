package PermutationSequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public String getPermutation(int n, int k) {
		int[] num = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < num.length; i++) {
			num[i] = 1;
		}
		for(int i = 0; i < num.length; i++) {
			int count = 1;
			while(set.contains(num[i])) num[i]++;
			while(k > count * factory(n - 1)) {
				count++;
				num[i]++;
				while(set.contains(num[i])) num[i]++;
			}
			set.add(num[i]);
			k -= (count - 1) * factory(n - 1);
			n--;
		}
		return arrToString(num);
	}

	private int factory(int j) {
		// TODO Auto-generated method stub
		int res = 1;
		for(int i = 1; i <= j; i++) {
			res *= i;
		}
		return res;
	}
	
	private String arrToString(int[] arr) {
		String s = "";
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
}
