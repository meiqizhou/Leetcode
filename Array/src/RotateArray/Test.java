package RotateArray;

public class Test {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6, 7};
		Solution s = new Solution();
		s.rotate(A, 3);
		for(int i = 0; i < A.length; i++){
			System.out.print(A[i] + " ");
		}
	}

}
