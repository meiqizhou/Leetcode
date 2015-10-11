package TrappingRainWater;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		Solution s = new Solution();
		int sum = s.trap(height);
		System.out.println(sum);
	}

}
