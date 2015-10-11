package WordSearch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		char[][] board = new char[3][4];
//		board[0] = new char[]{'a', 'b'};
//		board[1] = new char[]{'c', 'd'};
		board[0] = new char[]{'A', 'B', 'C', 'E'};
		board[1] = new char[]{'S', 'F', 'E', 'S'};
		board[2] = new char[]{'A', 'D', 'E', 'E'};
		String word = "ABCEFSADEESE";
		boolean b = s.exist(board, word);
		System.out.println(b);
	}

}
