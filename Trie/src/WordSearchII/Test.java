package WordSearchII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"aba","baa","bab","aaab","aaa","aaaa","aaba"};
		char[][] board = new char[4][4];
		board[0] = new char[]{'a','b'};
		board[1] = new char[]{'a','a'};
//		board[2] = new char[]{'i','h','k','r'};
//		board[3] = new char[]{'i','f','l','v'};
		Solution s = new Solution();
		s.findWords(board, words);
	}

}
