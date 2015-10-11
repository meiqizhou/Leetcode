package HouseRobber;
public class Solution {
	public int rob(int[] num) {
		if(num.length == 0) return 0;
		int len = num.length;
		int[] sum = new int[len];
		sum[0] = num[0];
		if(num.length == 1) return sum[0];
		sum[1] = Math.max(num[0], num[1]);
		if(num.length == 2) return sum[1];
		for(int i = 2; i < len; i++){
			sum[i] = Math.max(sum[i - 2] + num[i], sum[i - 1]);
		}
		return sum[len - 1];
    }
}
