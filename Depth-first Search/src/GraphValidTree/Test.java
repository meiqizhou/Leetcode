package GraphValidTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[][] edges = new int[4][2];
		edges[0] = new int[]{0, 1};
		edges[1] = new int[]{0, 2};
		edges[2] = new int[]{0, 3};
		edges[3] = new int[]{1, 4};
//		edges[4] = new int[]{1, 4};
		s.validTree(5, edges);
	}

}
