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
    public int countNodes(TreeNode root) {
        return count(root);
    }
    private static int count(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;
		int leftNodes = count(root.left);
		int rightNodes = count(root.right);
		return leftNodes + rightNodes + 1;
	}
}