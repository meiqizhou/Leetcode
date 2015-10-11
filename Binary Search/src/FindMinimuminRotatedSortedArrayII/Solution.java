package FindMinimuminRotatedSortedArrayII;

public class Solution {
	public static int findMin(int[] num) {
        return findMin(num, 0, num.length-1);
    }
	
    public static int findMin(int[] num, int start, int end) {
        if(end - start <= 1) return Math.min(num[start], num[end]);
        int middle = start + (end - start) / 2;
        //1111111111113456 -> 11134561111
        if(num[start] < num[middle]) {
        	if(num[middle] <= num[end]) return num[start];
        	else return findMin(num, middle, end);
        }
        //1111111111113456  -> 1134561111111
        else if(num[start] == num[middle]) {
        	if(num[middle] == num[end]) return Math.min(findMin(num, start, middle), findMin(num, middle, end));
        	else return findMin(num, middle, end);
        }
        else {
        	if(num[middle] <= num[end]) return findMin(num, start, middle);
        	else return -1;
        }
    }
}
