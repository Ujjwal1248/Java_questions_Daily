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
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
    public int maxSum = Integer.MIN_VALUE;
    public int helper(TreeNode root) {
        if(root == null) return 0;
        int ltSum = Math.max(0, helper(root.left));
        int rtSum = Math.max(0, helper(root.right));
        maxSum = Math.max(maxSum, ltSum+rtSum + root.val);
        return root.val + Math.max(ltSum, rtSum);
    }
}