package leetcode;

public class LC206 {
	
	public static void main(String args[]) {
		//write your tests here
		
	}
	
	private ListNode reverseList(ListNode head) {
		ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
	}
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			this.val = x;
		}
	}

}
