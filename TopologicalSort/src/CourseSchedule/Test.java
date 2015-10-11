package CourseSchedule;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pre = new int[2][2];
		pre[0] = new int[]{0, 1};
		pre[1] = new int[]{1, 0};
		Solution s = new Solution();
		System.out.println(s.canFinish(2, pre));
	}

}
