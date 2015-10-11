package ThreeSum;

import java.util.List;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] num = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = s.threeSum(num);
		for(int i = 0; i < res.size(); i++) {
			List<Integer> list = res.get(i);
			for(int j = 0; j < list.size(); j++){
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}
}
