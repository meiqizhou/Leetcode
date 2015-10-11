package RemoveDuplicatesfromSortedArray;

public class Test {
	public static void main(String args[]){
		Solution s = new Solution();
		int[] A = {1,1,1, 2,2, 3, 4, 5, 6};
		int res = s.removeDuplicates(A);
		System.out.println(res);
	}
}
