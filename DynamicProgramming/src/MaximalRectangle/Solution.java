package MaximalRectangle;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	private int maxRec = 0;
    public int maximalRectangle(char[][] matrix) {
    	int rows = matrix.length;
    	int cols = rows == 0 ? 0 : matrix[0].length;
    	int[][] height = new int[rows][cols];
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			if(matrix[i][j] == '1') height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
    		}
    	}
    	for(int i = 0; i < rows; i++) {
    		maxRec = Math.max(maxRec, largestRectangleArea(height[i]));
    	}
    	return maxRec;
    }
    
    public int largestRectangleArea(int[] height){
    	int i = 0, maxArea = 0;
    	int[] h = new int[height.length + 1];
    	h = Arrays.copyOf(height, height.length + 1);
    	Stack<Integer> stack = new Stack<Integer>();
    	while(i < h.length) {
    		if(stack.isEmpty() || h[stack.peek()] <= h[i]) stack.push(i++);
    		else {
    			int top = stack.pop();
    			if(stack.isEmpty()) maxArea = Math.max(maxArea, h[top] * i);
    			else maxArea = Math.max(maxArea, h[top] * (i - stack.peek() - 1));
    		}
    	}
    	return maxArea;
    }
}
