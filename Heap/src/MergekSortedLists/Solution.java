package MergekSortedLists;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
    	int N = lists.size(), i = 0, j = N - 1;
    	List<ListNode> templist =  new ArrayList<ListNode>();
    	while(i < j){
    		ListNode temp = mergeTwoLists(lists.get(i), lists.get(j));
    		i++;
    		j--;
    		templist.add(temp);
    	}
    	ListNode res = mergeKLists(templist);
    	return res;
    }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode l3 = new ListNode(0);
		 ListNode p3 = l3;
		 ListNode p1 = l1;
		 ListNode p2 = l2;
		 while(p1 != null && p2 != null)
		 {
			 if(p1.val < p2.val)
			 {
				 p3.next = p1;
				 p1 = p1.next;
			 }
			 else if(p1.val >= p2.val)
			 {
				 p3.next = p2;
				 p2 = p2.next;
			 }
			 p3 = p3.next;
		 }
		 if(p1 != null)
		 {
			 p3.next = p1;
		 }
		 else if(p2 != null){
			 p3.next = p2;
		 }
		 return l3.next;
	 }
}