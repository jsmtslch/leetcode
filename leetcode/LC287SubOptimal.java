package leetcode;

public class LC287SubOptimal {
	
	public static void main(String[] args) {
		int[] arr = {3,1,3,4,2};
		int dup = findDuplicate(arr);
		System.out.println(dup);
	}

	public static int findDuplicate(int[] nums) {
        int[] refArray = new int[nums.length+1];
        for(int i = 0 ; i < nums.length ; i++){
            if(refArray[nums[i]] != 0 )
                return nums[i];
            else
                refArray[nums[i]] = nums[i];
        }
        return 0;
    }
	
}
