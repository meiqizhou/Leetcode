package SearchforaRange;

public class Solution {
	public int[] searchRange(int[] A, int target) {
		int lo = 0, hi = A.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(A[mid] < target) lo = mid + 1;
			else if(A[mid] > target) hi = mid - 1;
			else {
				int i = mid, j = mid;
				while(i >= 0 && A[i] == target) i--;
				while(j <= A.length- 1 && A[j] == target) j++;
				if(j - i == 2) return new int[]{i + 1, i + 1};
				return new int[]{i + 1, j - 1};
			}
		}
		return new int[]{-1, -1};
    }
}
