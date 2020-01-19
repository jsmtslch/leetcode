package leetcode;

public class LC142 {
	
	class ListNode{
		int val;
		ListNode next;
	}
	
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				while(slow != head) {
					head = head.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}

}
