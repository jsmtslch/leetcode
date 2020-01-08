package leetcode;

public class LC53 {

	public static void main(String[] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int maxEndHere = arr[0], maxSoFar = arr[0];
		for(int i = 1; i < arr.length ; i++) {
			maxEndHere = Math.max(maxEndHere+arr[i], arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndHere);
		}
		System.out.println("Max Sum of a subarray is: "+maxSoFar);
	}
}
