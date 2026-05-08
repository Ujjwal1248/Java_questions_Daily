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
        if (root == null)
            return true;
        int leftH = height(root.left);
        int rightH = height(root.right);
        boolean bl = isBalanced(root.left);
        boolean bh = isBalanced(root.right);
        if (Math.abs(leftH - rightH) > 1)
            return false;
        return bl && bh;
    }

    private int height(TreeNode root) {
        if (root == null)
            return 0;
        int lt = height(root.left);
        int rt = height(root.right);
        if (Math.abs(lt - rt) > 1)
            return -1;
        // if (lt <= -1 || rt <= -1)
        //     return -1;
        return Math.max(lt, rt) + 1;
    }
}