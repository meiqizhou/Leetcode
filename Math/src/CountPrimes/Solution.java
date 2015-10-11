package CountPrimes;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<Integer> list = new ArrayList<Integer>();
    public int countPrimes(int n) {
    	int count = 0;
    	boolean[] prime = new boolean[n];
    	for(int i = 2; i < prime.length; i++) prime[i] = true;
    	for(int i = 2; i <= Math.sqrt(n - 1); i++) {
    		if(prime[i]) {
    			for(int j = i; i * j < n; j++) {
    				prime[i * j] = false;
    			}
    		}
    	}
    	for(int i = 0; i < n; i++) {
    		if(prime[i] == true) {
    			list.add(i);
    			count++;
    		}
    		
    	}
    	System.out.println(list);
    	return count;
    }
}
