package SurroundedRegions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[7][7];
		board[0] = new char[]{'X', 'O', 'X', 'O', 'O', 'O', 'O'};
		board[1] = new char[]{'X', 'O', 'O', 'O', 'O', 'O', 'O'};
		board[2] = new char[]{'X', 'O', 'O', 'O', 'O', 'X', 'O'};
		board[3] = new char[]{'O', 'O', 'O', 'O', 'X', 'O', 'X'};
		board[4] = new char[]{'O', 'X', 'O', 'O', 'O', 'O', 'O'};
		board[5] = new char[]{'O', 'O', 'O', 'O', 'O', 'O', 'O'};
		board[6] = new char[]{'O', 'X', 'O', 'O', 'O', 'O', 'O'};
//		char[][] board = new char[4][4];
//		board[0] = new char[]{'X', 'X', 'X', 'X'};
//		board[1] = new char[]{'X', 'O', 'O', 'X'};
//		board[2] = new char[]{'X', 'X', 'O', 'X'};
//		board[3] = new char[]{'X', 'O', 'X', 'X'};
		Solution s = new Solution();
		s.solve(board);
		System.out.println(board);
	}

}
