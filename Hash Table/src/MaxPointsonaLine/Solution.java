package MaxPointsonaLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	class pointComparator implements Comparator<Point> {
		public int compare(Point p1, Point p2) {
			if(p1.x < p2.x) return -1;
			else if(p1.x > p2.x) return 1;
			else {
				if(p1.y < p2.y) return -1;
				else if(p1.y > p2.y) return 1;
				else return 0;
			}
		}		
	}
	private int mostDup = 0;
    public int maxPoints(Point[] points) {
    	if(points.length == 0) return 0;
    	if(points.length == 1) return 1;
    	Arrays.sort(points, new pointComparator());
    	Map<List<Integer>, Integer> countMap = getNumMap(points);
    	Map<List<Double>, List<List<Integer>>> map = new HashMap<List<Double>, List<List<Integer>>>();
    	List<List<Double>> keyList = new ArrayList<List<Double>>();
    	for(int i = 0; i < points.length; i++) {
    		if(i > 0 && points[i].x == points[i - 1].x && points[i].y == points[i - 1].y) continue;
    		for(int j = i + 1; j < points.length; j++) {
    			Point A = points[i], B = points[j];
    			if(A.x == B.x && A.y == B.y) continue;
    			int x1 = A.x, y1 = A.y, x2 = B.x, y2 = B.y;
    			double k, b;
    			if(x2 - x1 != 0) {
    				k = (double)(y2 - y1) / (x2 - x1);
    				b = (double)(x2 * y1 - x1 * y2) / (x2 - x1);
    			}
    			else {
    				k = Double.NaN;
    				b = x1;
    			}
    			List<Double> list = new ArrayList<Double>();
    			list.add(k == -0.0 ? 0.0 : k);
    			list.add(b == -0.0 ? 0.0 : b);
    			if(map.containsKey(list)) { //在一条直线上
    				List<Integer> tempList = new ArrayList<Integer>();
					tempList.add(B.x);
					tempList.add(B.y);
    				if(!map.get(list).contains(tempList)) {
    					map.get(list).add(tempList);
    				}
    			}
    			else {
    				keyList.add(list);
    				map.put(list, new ArrayList<List<Integer>>());
    				List<Integer> temp1 = new ArrayList<Integer>();
    				temp1.add(A.x);
    				temp1.add(A.y);
    				List<Integer> temp2 = new ArrayList<Integer>();
    				temp2.add(B.x);
    				temp2.add(B.y);
    				map.get(list).add(temp1);
    				map.get(list).add(temp2);
    			}
    		}
    	}
		return getMaxLen(map, countMap, keyList);
    	
    }
    
    private int getMaxLen(Map<List<Double>, List<List<Integer>>> map, Map<List<Integer>, Integer> countMap, List<List<Double>> keyList) {
		// TODO Auto-generated method stub
    	int maxLen = 0;
    	if(map.size() == 0) return mostDup;
		for(int i = 0; i < keyList.size(); i++) {
			List<Double> tempList = keyList.get(i);
			if(map.containsKey(tempList)) {
				int tempLen = getDupLen(map.get(tempList), countMap);
				maxLen = Math.max(tempLen, maxLen);
			}
		}
		return maxLen;
	}

	private int getDupLen(List<List<Integer>> list, Map<List<Integer>, Integer> countMap) {
		// TODO Auto-generated method stub
		int sum = list.size();
		for(int i = 0; i < list.size(); i++) {
			List<Integer> tempList = list.get(i);
			if(countMap.containsKey(tempList)) sum += countMap.get(tempList) - 1; 
		}
		return sum;
	}

	private Map<List<Integer>, Integer> getNumMap(Point[] points) {
		// TODO Auto-generated method stub
    	Map<List<Integer>, Integer> map = new HashMap<List<Integer>, Integer>();
    	for(int i = 0; i < points.length; i++) {
    		List<Integer> temp = new ArrayList<Integer>();
    		temp.add(points[i].x);
    		temp.add(points[i].y);
    		if(map.containsKey(temp)) map.put(temp, map.get(temp) + 1);
    		else map.put(temp, 1);
    		mostDup = Math.max(mostDup, map.get(temp));
    	}
    	return map;
	}
}
