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
    public static int helper(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int length = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode root = q.poll();
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            length++;
        }
        return length;
    }
}