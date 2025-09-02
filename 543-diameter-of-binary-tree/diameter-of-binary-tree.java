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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root) - 1;
    }
    private static int diameter(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		int dia1 = diameter(root.left);
		int dia2 = diameter(root.right);
		int dia3 = heightTree(root.left) + heightTree(root.right) + 1;
		return Math.max(dia2, Math.max(dia1, dia3));
	}

	private static int heightTree(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}
		int leftH = heightTree(root.left);
		int rightH = heightTree(root.right);

		return Math.max(leftH, rightH) + 1;
	}
}