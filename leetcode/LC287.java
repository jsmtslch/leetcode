package leetcode;

public class LC287 {

	public static void main(String[] args) {
		int[] arr = {5,2,4,2,2,3,1};
		System.out.println(findDuplicate(arr));
	}

	private static int findDuplicate(int[] arr) {
		int slow = arr[0];
		int fast = arr[arr[0]];
		while(slow != fast) {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}
		fast = 0;
		while(fast != slow) {
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}
}
