package MergekSortedLists;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
    	if(lists.size() == 0) return null;
    	if(lists.size() == 1) return lists.get(0);
    	int N = lists.size();
    	List<ListNode> first = new ArrayList<ListNode>();
    	List<ListNode> second = new ArrayList<ListNode>();
    	first.addAll(lists.subList(0, N / 2));
    	second.addAll(lists.subList(N / 2, N));
    	ListNode l1 = mergeKLists(first);
    	ListNode l2 = mergeKLists(second);
    	return mergeTwoLists(l1, l2);
    }
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p3 = l3;
		while(p1 != null && p2 != null){
			if(p1.val <= p2.val){
				p3.next = p1;
				p1 = p1.next;
			}
			else{
				p3.next = p2;
				p2 = p2.next;
			}
			p3 = p3.next;
		}
		if(p1 != null) p3.next = p1;
		else p3.next = p2;
		return l3.next;
    }
}
