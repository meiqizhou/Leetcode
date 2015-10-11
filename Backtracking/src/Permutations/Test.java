package Permutations;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] a = {1, 2, 3};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res = s.permute(a);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < res.size(); i++){
			for(int j = 0; j < res.get(i).size(); j++){
				sb.append(res.get(i).get(j));
			}
			sb.append(" ");
		}
		System.out.print(sb);
	}
}
