package TrappingRainWater;



public class Solution {
    public int trap(int[] height) {
    	int start = 0, end = height.length - 1;
    	int min = 0, sum = 0;
    	while(start < end) {
    		while(start < height.length - 1 && start < end && height[start] <= min) start++;
    		while(end > -1 && start < end && height[end] <= min) end--;
    		sum += calculatewater(height, start, end);
    		min = Math.min(height[start], height[end]);
    	}
		return sum;
    }

	private int calculatewater(int[] height, int start, int end) {
		// TODO Auto-generated method stub
		int min = Math.min(height[start], height[end]), sum = 0;
		for(int i = start; i <= end; i++) {
			if(height[i] < min) {
				sum += min - height[i];
				height[i] = min;
			}			
		}
		return sum;
	}
}