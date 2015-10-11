package InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Interval one = new Interval(0, 1);
		Interval two = new Interval(2, 5);
		Interval three = new Interval(6, 7);
		Interval four = new Interval(8, 9);
//		Interval five = new Interval(12, 16);
		Interval temp = new Interval(0, 1);
		List<Interval> list = new ArrayList<Interval>();
//		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
//		list.add(five);

		Solution s = new Solution();
		s.insert(list, temp);
		
	}

}
