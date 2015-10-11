package Triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int len = triangle.size();
    	int sum[] = new int[len];
    	for(int i = 0; i < triangle.get(len - 1).size(); i++) {
    		sum[i] = triangle.get(len - 1).get(i);
    	}
    	for(int i = len - 2; i > -1; i--) {
    		List<Integer> next = triangle.get(i);
    		for(int j = 0; j < next.size(); j++) {
    			sum[j] = next.get(j) + Math.min(sum[j], sum[j + 1]);
    		}
    	}
    	return sum[0];
    }
}
