package WiggleSort;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = new int[]{1};
		s.wiggleSort(nums);
		for(int i = 0; i < nums.length; i++) System.out.print(nums[i] + " ");
	}

}
