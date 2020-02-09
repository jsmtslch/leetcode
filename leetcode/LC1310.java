package leetcode;

public class LC1310 {
	
	public static void main(String[] args) {
		int[] arr = {4,8,2,10};
		int[][] queries = {{2,3},{1,3},{0,0},{0,3}};
		int[] ans = new int[queries.length];
		for(int i = 1 ; i < arr.length ; i++) {
			arr[i] ^= arr[i-1];
		}
		for(int i = 0 ; i < queries.length ; i++) {
			if(queries[i][0] == 0)
				ans[i] = arr[queries[i][1]];
			else {
				ans[i] = arr[queries[i][0]-1] ^ arr[queries[i][1]];
			}
		}
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.println(ans[i]);
		}
	}

}
