package GraphValidTree;

import java.util.Comparator;

class ArrayComparator implements Comparator<int[]> {

	@Override
	public int compare(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		if(num1[0] < num2[0]) return -1;
		else if(num1[0] > num2[0]) return 1;
		else {
			if(num1[1] < num2[1]) return -1;
			else if(num1[1] > num2[1]) return 1;
			return 0;
		}
	}
}
