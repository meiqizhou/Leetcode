package RotateImage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[4][4];
		matrix[0] = new int[]{1, 2, 3, 4};
		matrix[1] = new int[]{5, 6, 7, 8};
		matrix[2] = new int[]{9, 10, 11, 12};
		matrix[3] = new int[]{13, 14, 15, 16};
		Solution s = new Solution();
		s.rotate(matrix);
	}

}
