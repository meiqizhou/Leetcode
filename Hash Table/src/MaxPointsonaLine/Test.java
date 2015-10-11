package MaxPointsonaLine;

public class Test {
	public static void main(String args[]){
//		[84,250],[0,0],[1,0],[0,-70],[0,-70],[1,-1],[21,10],[42,90],[-42,-230]
		Point one = new Point(1, 1);
		Point two = new Point(1, 1);
		Point three = new Point(2, 2);
		Point four = new Point(2, 2);
//		Point five = new Point(0, -70);
//		Point six = new Point(1, -1);
//		Point seven = new Point(21, 10);
//		Point eight = new Point(42, 90);
//		Point nine = new Point(-42, -230);
		Point[] points = new Point[]{};
//		, four, five, six, seven, eight, nine
		Solution s = new Solution();
		int res = s.maxPoints(points);
		System.out.println(res);
	}
}
