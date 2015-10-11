package GroupShiftedStrings;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
//		String[] strings = new String[]{"fpbnsbrkbcyzdmmmoisaa", "cpjtwqcdwbldwwrryuclcngw", "a", "fnuqwejouqzrif", "js", "qcpr", "zghmdiaqmfelr", "iedda", "l", "dgwlvcyubde", "lpt", "qzq", "zkddvitlk", "xbogegswmad", "mkndeyrh", "llofdjckor", "lebzshcb", "firomjjlidqpsdeqyn", "dclpiqbypjpfafukqmjnjg", "lbpabjpcmkyivbtgdwhzlxa", "wmalmuanxvjtgmerohskwil", "yxgkdlwtkekavapflheieb", "oraxvssurmzybmnzhw", "ohecvkfe", "kknecibjnq", "wuxnoibr", "gkxpnpbfvjm", "lwpphufxw", "sbs", "txb", "ilbqahdzgij", "i", "zvuur", "yfglchzpledkq", "eqdf", "nw", "aiplrzejplumda", "d", "huoybvhibgqibbwwdzhqhslb", "rbnzendwnoklpyyyauemm"};
//		s.groupStrings(strings);
		String s1 = "yfglchzpledkq", s2 = "zghmdiaqmfelr";
		Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
    	int count = 0;
    	for(char c = 'a'; c <= 'z'; c++) {
    		letterMap.put(c, count++);
    	}
		s.getKey(s1, letterMap);
		s.getKey(s2, letterMap);
	}

}
