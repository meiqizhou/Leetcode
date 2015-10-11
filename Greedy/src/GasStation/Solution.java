package GasStation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int N = gas.length, sum = 0, total = 0, j = -1;
    	for(int i = 0; i < N; i++) {
    		sum += gas[i] - cost[i];
    		total += gas[i] - cost[i];
    		if(sum < 0) {
    			j = i;
    			sum = 0;
    		}
    	}
    	return total < 0 ? -1 : j + 1;
    }
}
