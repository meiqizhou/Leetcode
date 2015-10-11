package MergekSortedLists;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		List<ListNode> res = new ArrayList<ListNode>();
		ListNode p = new ListNode(1);
		ListNode q = new ListNode(0);
		p.next = null;
		q.next = null;
		res.add(p);
		res.add(q);
		s.mergeKLists(res);
	}

}
