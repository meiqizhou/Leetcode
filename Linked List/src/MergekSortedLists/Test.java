package MergekSortedLists;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ListNode> lists = new ArrayList<ListNode>();
		ListNode first = null;
		ListNode second = new ListNode(1);
		second.next = null;
		lists.add(first);
		lists.add(second);
		Solution s = new Solution();
		s.mergeKLists(lists);
	}

}
