package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(num);
    	if(num.length < 4) return res;
    	int N = num.length;
    	for(int i = 0; i < N; i++) {
    		if(i == 0 || num[i] > num[i - 1]){
    			for(int j = i + 1; j < N; j++) {
    				if(j == i + 1 || num[j] > num[j - 1]) {
    					int sum = target - num[i] - num[j];
    					int start = j + 1, end = N - 1;
    					while(start < end) {
    						if(num[start] + num[end] < sum) start++;
    						else if(num[start] + num[end] > sum) end--;
    						else {
    							List<Integer> list = new ArrayList<Integer>();
    							list.add(num[i]);
    							list.add(num[j]);
    							list.add(num[start]);
    							list.add(num[end]);
    							res.add(list);
    							start++;
    							end--;
    							while(start < end && num[start] == num[start - 1]) start++;
    							while(start < end && num[end] == num[end + 1] ) end--;
    						}
    					}
    				}
    			}
    		}
    	}
		return res;
    }
}