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
    public boolean isBalanced(TreeNode root) {
        int ht = height(root);
        if (ht == -1)
            return false;
        return true;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int lt = height(root.left);
        if(lt == -1) return -1;
        int rt = height(root.right);
        if(rt == -1) return -1;
        if (Math.abs(lt - rt) > 1)
            return -1;
        return Math.max(lt, rt) + 1;
    }
}