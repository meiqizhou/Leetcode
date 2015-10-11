package Triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int len = triangle.size() - 1;
    	int[] sum = new int[len];
    	for(int i = 0; i < sum.length; i++){
    		sum[i] = triangle.get(len).get(i);
    	}
    	for(int i = triangle.size() - 2; i > -1; i--){
    		for(int j = 0; j < triangle.get(i).size(); j++){
    			sum[j] = triangle.get(i).get(j) + Math.min(sum[j], sum[j + 1]);
    		}
    	}
    	return sum[0];
    }
}