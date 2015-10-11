package WordLadder;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Set<String> wordDict= new HashSet<String>();
		wordDict.add("a");
		wordDict.add("b");
		wordDict.add("c");
//		wordDict.add("lot");
//		wordDict.add("log");
		int res = s.ladderLength("a", "c", wordDict);
		System.out.println(res);
	}

}
