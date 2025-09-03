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
    private int maxV;
    public int maxPathSum(TreeNode root) {
        maxV = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxV;
    }
    public int maxPathDown(TreeNode root) {
        if(root == null) return 0;
        int left = Math.max(0, maxPathDown(root.left));
        int right = Math.max(0, maxPathDown(root.right));
        maxV = Math.max(maxV, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}