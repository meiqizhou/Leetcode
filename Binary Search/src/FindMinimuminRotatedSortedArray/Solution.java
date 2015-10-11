package FindMinimuminRotatedSortedArray;

public class Solution {
    public int findMin(int[] num) {
    	return binarySmallest(num, 0, num.length - 1);
    }

    private int binarySmallest(int[] arr, int low, int hi){
        if(hi - low <= 1) { // if there are two or less elements.
            return Math.min(arr[low], arr[hi]);
        }

        //otherwise - find mid point
        int mid = (low + (hi-low)/2);

        if(arr[mid]<arr[hi] && arr[mid]<arr[low]){
            //if mid element is lesser than both hi and low elements,
            // smallest between mid and greater amongst (low, hi); e.g. 6 7 1 2 3 4 5
            if(arr[low]>arr[hi]){
                return binarySmallest(arr, low, mid);
            } else {
                return binarySmallest(arr, mid, hi);
            }
        } else if(arr[mid]>arr[hi] && arr[mid]>arr[low]){
            //if mid is greater than both hi and low elements,
            // smallest between mid and lesser amongst (hi, low); e.g. 4 5 6 7 1 2 3
            if(arr[low]>arr[hi]){
                return binarySmallest(arr, mid, hi);
            } else {
                return binarySmallest(arr, low, mid);
            }
        } else {
            //else, if the array is not rotated, i.e. rotated by 0
           return arr[low]; 
        }

    }
}
