package ContainsDuplicateIII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = new int[]{1,3,6,2};
		boolean b = s.containsNearbyAlmostDuplicate(nums, 1, 2);
		System.out.println(b);
	}

}
