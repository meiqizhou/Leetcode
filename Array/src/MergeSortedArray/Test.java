package MergeSortedArray;

public class Test {
	public static void main(String args[]){
		Solution s = new Solution();
		int[] A = new int[5];
		A[0] = 1; 
		A[1] = 3;
		A[2] = 5;
		int[] B = {2, 4};
		s.merge(A, 3, B, 2);
	}
}
