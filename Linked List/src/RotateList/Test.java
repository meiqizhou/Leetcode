package RotateList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		first.next = second;
		second.next = null;
		Solution s = new Solution();
		s.rotateRight(first, 1);
	}

}
