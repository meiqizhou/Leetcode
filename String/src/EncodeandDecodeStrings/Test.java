package EncodeandDecodeStrings;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Codec c = new Codec();
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("");
		list.add("b");
		String str = c.encode(list);
		c.decode(str);
	}

}
