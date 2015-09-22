package PerfectSquares;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * @author lby
 *
 */
public class Solution {
	public int numSquares(int n) {
		if(n <= 1) return 1;
		Set<Integer> squareSet = buildSet(n);
		int[] dp = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			if(squareSet.contains(i)) dp[i] = 1;
			for(int j: squareSet) {
				if(i + j > n) continue;
				else dp[i + j] = dp[i + j] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + j]);
			}
			
		}
		return dp[n];
	}

	private Set<Integer> buildSet(int n) {
		// TODO Auto-generated method stub
		Set<Integer> squareSet = new HashSet<Integer>();
		for(int i = 1; i * i <= n; i++) {
			squareSet.add(i * i);
		}
		return squareSet;
	}
}
