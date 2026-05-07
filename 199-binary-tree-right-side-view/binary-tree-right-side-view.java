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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        if(root == null) return ll;
        ll.add(root.val);
        helper(root, 0, ll);
        return ll;
    }
    public int maxH = 0;
    public void helper(TreeNode root, int currH, List<Integer> ll) {
        if(root == null) return;
        if(currH > maxH){
            ll.add(root.val);
            maxH = currH;
        }
        helper(root.right, currH + 1, ll);
        helper(root.left, currH + 1, ll);
    }
}