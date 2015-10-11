package WordSearch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		char[][] board = new char[3][4];
		board[0] = new char[]{'A', 'B', 'C', 'E'};
		board[1] = new char[]{'S', 'F', 'C', 'S'};
		board[2] = new char[]{'A', 'D', 'E', 'E'};
		String word = "ABCCED";
		boolean b = s.exist(board, word);
		System.out.println(b);
	}

}
