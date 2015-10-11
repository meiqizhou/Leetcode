package Triangle;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> one = new ArrayList<Integer>();
		one.add(2);
		List<Integer> two = new ArrayList<Integer>();
		two.add(3);
		two.add(4);
		List<Integer> three = new ArrayList<Integer>();
		three.add(6);
		three.add(5);
		three.add(7);
		List<Integer> four = new ArrayList<Integer>();
		four.add(4);
		four.add(1);
		four.add(8);
		four.add(3);
		res.add(one);
		res.add(two);
		res.add(three);
		res.add(four);
		s.minimumTotal(res);
		
	}

}
