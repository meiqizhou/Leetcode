package MajorityElementII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums.length == 0) return list;
        else if(nums.length == 1) {
        	list.add(nums[0]);
        	return list;
        }
        else if(nums.length == 2) {
        	if(nums[0] == nums[1]) {
        		list.add(nums[0]);
        		return list;
        	}
        	else {
        		list.add(nums[0]);
        		list.add(nums[1]);
        		return list;
        	}
        }
        else {
        	if(nums[0] != nums[1]) {
            	int m1 = nums[0], m2 = nums[1], count1 = 1, count2 = 1;
            	for(int i = 2; i < nums.length; i++) {
            		if(nums[i] == m1) count1++;
            		else if(nums[i] == m2) count2++;
            		else {
            			count1--;
            			count2--;
            		}
            		if(count1 < 0) {
            			m1 = nums[i];
            			count1 = 1;
            		}
            		else if(count2 < 0){
            			m2 = nums[i];
            			count2 = 1;
            		}
            	}
            	count1 = 0; count2 = 0;
            	for(int i = 0; i < nums.length; i++) {
            		if(nums[i] == m1) count1++;
            		else if(nums[i] == m2) count2++;
            	}
            	if(count1 > nums.length / 3) list.add(m1);
            	if(count2 > nums.length / 3) list.add(m2);
            	return list;
        	}
        	else {
        		int j = 1;
        		while(j < nums.length && nums[j] == nums[0]) j++;
        		if(j == nums.length) {
        			list.add(nums[0]);
        			return list;
        		}
        		int m1 = nums[0], m2 = nums[j], count1 = j, count2 = 1;
        		for(int i = j + 1; i < nums.length; i++) {
            		if(nums[i] == m1) count1++;
            		else if(nums[i] == m2) count2++;
            		else {
            			count1--;
            			count2--;
            		}
            		if(count1 < 0) {
            			m1 = nums[i];
            			count1 = 1;
            		}
            		else if(count2 < 0){
            			m2 = nums[i];
            			count2 = 1;
            		}
            	}
            	count1 = 0; count2 = 0;
            	for(int i = 0; i < nums.length; i++) {
            		if(nums[i] == m1) count1++;
            		else if(nums[i] == m2) count2++;
            	}
            	if(count1 > nums.length / 3) list.add(m1);
            	if(count2 > nums.length / 3) list.add(m2);
            	return list;
        	}
        }
    }
}
