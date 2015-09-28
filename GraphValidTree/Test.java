package GraphValidTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[][] edges = new int[3][2];
		edges[0] = new int[]{0, 1};
		edges[1] = new int[]{2, 3};
		edges[2] = new int[]{1, 2};
		System.out.println(s.validTree(4, edges));
	}

}
