package WordLadderII;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Set<String> dict = new HashSet<String>();
		String[] str = new String[]{"hot","dot","dog","lot","log"};
		for(int i = 0; i < str.length; i++) {
			dict.add(str[i]);
		}
		s.findLadders("hit", "cog", dict);
	}

}
