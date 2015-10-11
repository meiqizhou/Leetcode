package FindPeakElement;

public class Solution {
    public int findPeakElement(int[] num) {
    	if(num.length == 1) return 0;
    	if(num[1] < num[0]) return 0;
    	if(num[num.length - 2] < num[num.length - 1]) return num.length - 1;
    	int i = 1;
    	for(i = 1; i <= num.length - 2; i++){
    		if(num[i - 1] < num[i] && num[i + 1] < num[i]) break; 
    	}
    	return i;
    }
}
