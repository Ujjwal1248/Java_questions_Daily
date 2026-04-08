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
    // public class DiaPair{
    //     TreeNode left, right;
    //     int ht;
    // }
    public int maxH = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxH;
    }
    // public void helper1(TreeNode root) {
    //     if(root == null) return;
    //     int left = helper(root.left);
    //     int right = helper(root.right);
    //     maxH = Math.max(maxH, left + right);
    //     helper1(root.left);
    //     helper1(root.right);
    // }

    public int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        maxH = Math.max(maxH, left + right);
        return Math.max(left, right) + 1;
    }

}