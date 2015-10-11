package WallsandGates;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[][] rooms = new int[4][4];
		int INF = Integer.MAX_VALUE;
		rooms[0] = new int[]{INF, -1, 0, INF};
		rooms[1] = new int[]{INF, INF, INF, -1};
		rooms[2] = new int[]{INF, -1, INF, -1};
		rooms[3] = new int[]{0, -1, INF, INF};
		s.wallsAndGates(rooms);
	}
}
