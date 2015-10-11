package MaximalSquare;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		char[][] matrix = new char[4][5];
		matrix[0] = new char[]{'1', '0', '1', '0', '0'};
		matrix[1] = new char[]{'1', '0', '1', '1', '1'};
		matrix[2] = new char[]{'1', '1', '1', '1', '1'};
		matrix[3] = new char[]{'1', '0', '0', '1', '0'};
		int res = s.maximalSquare(matrix);
		System.out.println(res);
	}

}
