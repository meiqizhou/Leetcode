package ReverseWordsinaStringII;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'a', ' ', 'b'};
		Solution solution = new Solution();
		solution.reverseWords(s);
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i]);
		}
	}
}
