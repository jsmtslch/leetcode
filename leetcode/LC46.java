package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC46 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> permutations = new ArrayList<>();
		if (nums.length == 0) {
			System.out.println("Nothing to permute");
		}

		collectPermutations(nums, 0, new ArrayList<>(), permutations);
		for(List<Integer> perm : permutations) {
			System.out.println(perm);
		}
	}
	
	private static void collectPermutations(int[] nums, int start, List<Integer> permutation, List<List<Integer>>  permutations) {
		
		if (permutation.size() == nums.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Integer> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, nums[start]);
			collectPermutations(nums, start + 1, newPermutation, permutations);
		}
	}

}
