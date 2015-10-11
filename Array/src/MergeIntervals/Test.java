package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval one = new Interval(13, 43);
		Interval two = new Interval(2, 5);
		Interval three = new Interval(2, 6);
		Interval four = new Interval(1, 3);
		List<Interval> list = new ArrayList<Interval>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		Solution s = new Solution();
		s.merge(list);
	}

}
