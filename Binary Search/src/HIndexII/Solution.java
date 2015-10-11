package HIndexII;

public class Solution {
	public int hIndex(int[] citations) {
		if(citations.length == 0) return 0;
		int lo = 0, hi = citations.length - 1, N = lo + hi + 2;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(lo != hi && citations[mid] > N - ((lo + hi + 2) / 2)) hi = mid;
			else if(lo != hi && citations[mid] < N - ((lo + hi + 2) / 2)) lo = mid + 1;
			else if(lo != hi && citations[mid] == N - ((lo + hi + 2) / 2)) return N - ((lo + hi + 2) / 2);
			else if(lo == hi && citations[mid] < N - ((lo + hi + 2) / 2)) {
				lo++;
				break;
			}
			else if(lo == hi && citations[mid] > N - ((lo + hi + 2) / 2)) break;
			else return N - ((lo + hi + 2) / 2);
		}
		return lo == citations.length ? 0 : citations.length - hi;
    }
}
