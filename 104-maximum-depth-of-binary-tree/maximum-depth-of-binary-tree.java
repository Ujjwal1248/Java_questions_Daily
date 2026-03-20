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
        if(root == null) return 0;
        return helper(root);
    }
    public int helper(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int count = 0;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            count++;
            for(int i = 0; i < n; i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                // count++;
            }
            // q.remove();
        }
        return count;
    }
}