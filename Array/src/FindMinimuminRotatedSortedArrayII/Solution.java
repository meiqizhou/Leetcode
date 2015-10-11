package FindMinimuminRotatedSortedArrayII;

public class Solution {
    public int findMin(int[] num) {
    	if(num.length == 1) return num[0];
		int i = 1;
		while(i < num.length){
			if(num[i] < num[i - 1]) break;
			i++;
			if(i == num.length) return num[0];
		}
		return num[i];
    }
}
