package ClimbingStairs;

public class Solution {
	public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int start = 1, end = 2, count = 3;
        while(count <= n) {
            int temp = end;
            end = start + end;
            start = temp;
            count++;
        }
        return end;
    }
}
