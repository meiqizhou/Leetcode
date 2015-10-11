package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Interval i1 = new Interval(5, 5);
		Interval i2 = new Interval(1, 3);
		Interval i3 = new Interval(3, 5);
		Interval i4 = new Interval(4, 6);
		Interval i5 = new Interval(1, 1);
		Interval i6 = new Interval(3, 3);
		Interval i7 = new Interval(5, 6);
		Interval i8 = new Interval(3, 3);
		Interval i9 = new Interval(2, 4);
		Interval i10 = new Interval(0, 0);
		List<Interval> list = new ArrayList<Interval>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		list.add(i6);
		list.add(i7);
		list.add(i8);
		list.add(i9);
		list.add(i10);
		s.merge(list);
	}

}
