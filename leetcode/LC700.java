package leetcode;

public class LC700 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode searchBST(TreeNode root, int val) {
		while (root != null) {
			if (root.val == val) {
				return root;
			}
			if (root.val > val) {
				root = root.left;
			} else if (root.val < val) {
				root = root.right;
			}
		}
		return null;
	}
}
