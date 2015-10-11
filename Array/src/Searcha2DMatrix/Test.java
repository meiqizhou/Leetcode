package Searcha2DMatrix;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[][] matrix = new int[1][1];
		matrix[0][0] = 1;
		boolean b = s.searchMatrix(matrix, 0);
		System.out.println(b);
	}

}
