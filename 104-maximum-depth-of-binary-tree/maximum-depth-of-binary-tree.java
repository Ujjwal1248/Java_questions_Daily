/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return heightTree(root);
    }
    private static int heightTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftH = heightTree(root.left);
		int rightH = heightTree(root.right);

		return Math.max(leftH, rightH) + 1;
	}
}