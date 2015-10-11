package TrappingRainWater;

public class Solution {
    public int trap(int[] height) {
        int min = 0, i = 0, j = height.length - 1, res = 0;
        while(i < j) {
            while(i < j && height[i] <= min) i++;
            while(i < j && height[j] <= min) j--;
            min = Math.min(height[i], height[j]);
            res += calculateWater(height, i, j, min);
            i++;
            j--;
        }
        return res;
    }
    
    private int calculateWater(int[] height, int start, int end, int min) {
        int res = 0;
        for(int i = start; i <= end; i++) {
            if(min - height[i] > 0) {
                res += min - height[i];
                height[i] = min;
            }
        }
        return res;
    }
}
