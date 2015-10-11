package MaximumGap;

public class Solution {
	public int maximumGap(int[] num){
		if(num.length < 2) return 0;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, maxGap = 0;
		for(int i = 0; i < num.length; i++) {
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);
		}
		boolean[] B = new boolean[max + 1];
		for(int i = 0; i < num.length; i++) {
			B[num[i]] = true;
		}
		int start = min, end = min + 1;
		while(end <= max) {
			while(!B[end]) end++;
			maxGap = Math.max(maxGap, end - start);
			start = end;
			end = start + 1;
		}
		return maxGap;
	}
}
