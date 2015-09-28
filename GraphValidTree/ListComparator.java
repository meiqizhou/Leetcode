package GraphValidTree;

import java.util.Comparator;

public class ListComparator implements Comparator<int[]> {

	@Override
	public int compare(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		if(arr1[0] < arr2[0]) return -1;
		else if(arr1[0] > arr2[0]) return 1;
		else {
			if(arr1[1] < arr2[1]) return -1;
			else if(arr1[1] > arr2[1]) return 1;
			else return 0;
		}
	}
}
