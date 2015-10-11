package BitwiseANDofNumbersRange;

public class Solution {
	public int rangeBitwiseAnd(int m, int n) {
		if(m == 0 || n == 0) return 0;
		int res = 1 & 1;
		int[] arr = new int[n - m + 1];
		arr[0] = m;
		for(int i = 1; i < arr.length; i++){
			arr[i] = arr[i - 1] & (m + i);
		}
		return arr[arr.length - 1];
    }
}
