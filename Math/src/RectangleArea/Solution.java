package RectangleArea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	class listComparator implements Comparator<int[]> {

		@Override
		public int compare(int[] arr1, int[] arr2) {
			// TODO Auto-generated method stub
			if(arr1[0] < arr2[0]) return - 1;
			else if(arr1[0] > arr2[0]) return 1;
			else {
				if(arr1[1] < arr2[1]) return -1;
				else if(arr1[1] > arr2[1]) return 1;
				else return 0;
			}
		}
		
	}
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	List<int[]> xList = new ArrayList<int[]>();
    	List<int[]> yList = new ArrayList<int[]>();
    	int[] arrx1 = new int[]{A, C};
    	int[] arrx2 = new int[]{E, G};
    	int[] arry1 = new int[]{B, D};
    	int[] arry2 = new int[]{F, H};
    	xList.add(arrx1); 
    	xList.add(arrx2);
    	yList.add(arry1);
    	yList.add(arry2);
    	Collections.sort(xList, new listComparator());
    	Collections.sort(yList, new listComparator());
    	int dupArea = getDupArea(xList, yList);
    	return (C - A) * (D - B) + (G - E) * (H - F) - dupArea;
    }
	private int getDupArea(List<int[]> xList, List<int[]> yList) {
		// TODO Auto-generated method stub
		int xLen = getDulxLen(xList);
		int yLen = getDupyLen(yList);
		return xLen != 0 && yLen != 0 ? xLen * yLen : 0;
	}
	private int getDupyLen(List<int[]> yList) {
		// TODO Auto-generated method stub
		if(yList.get(1)[0] >= yList.get(0)[1]) return 0;
		else return Math.min(yList.get(0)[1], yList.get(1)[1]) - yList.get(1)[0];
	}
	private int getDulxLen(List<int[]> xList) {
		// TODO Auto-generated method stub
		if(xList.get(1)[0] >= xList.get(0)[1]) return 0;
		else return Math.min(xList.get(0)[1], xList.get(1)[1]) - xList.get(1)[0];
	}
}
