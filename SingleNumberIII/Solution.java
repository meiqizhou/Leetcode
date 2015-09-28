package SingleNumberIII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] singleNumber(int[] nums) {
    	int[] res = new int[]{0, 0};
    	int diff = 0;
    	for(int i = 0; i < nums.length; i++) {
    		diff ^= nums[i];
    	}
    	int diffPos = 0;
    	for(int i = 0; i < 32; i++) {
    		if((diff >> i & 1) == 1) diffPos = i;
    	}
    	List<Integer> A = new ArrayList<Integer>();
    	List<Integer> B = new ArrayList<Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		if((nums[i] >> diffPos & 1) == 1) A.add(nums[i]);
    		else B.add(nums[i]);
    	}
    	for(int i = 0; i < A.size(); i++) {
    		res[0] ^= A.get(i);
    	}
    	for(int j = 0; j < B.size(); j++) {
    		res[1] ^= B.get(j);
    	}
    	return res;
    }
}
