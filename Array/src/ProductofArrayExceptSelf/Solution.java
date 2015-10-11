package ProductofArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	int n = nums.length;
    	int[] output = new int[n];
    	output[n - 1] = 1;
    	for(int i = n - 2; i > -1; i--) {
    		output[i] = output[i + 1] * nums[i + 1];
    	}
    	int element = 1;
    	for(int i = 0; i < n; i++) {
    		output[i] *= element;
    		element *= nums[i];
    	}
    	return output;
    }
}