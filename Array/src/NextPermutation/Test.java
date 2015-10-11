package NextPermutation;

public class Test {
	public static void main(String[] args){
		Solution s = new Solution();
		int[] num = {1, 5, 1};
		s.nextPermutation(num);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
