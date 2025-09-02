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
    static class TreeInfo{
		int diam;
		int ht;
		public TreeInfo(int diam, int ht) {
			// TODO Auto-generated constructor stub
			this.ht = ht;
			this.diam = diam;
		}
	}
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter2(root).diam - 1;
    }
    private static TreeInfo diameter2(TreeNode root) {
		if(root == null) return new TreeInfo(0, 0);
		TreeInfo left = diameter2(root.left);
		TreeInfo right= diameter2(root.right);
		
		int myHeight = Math.max(left.ht, right.ht) + 1;
		
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;
		
		int myDiam = Math.max(diam2, Math.max(diam1, diam3));
		
		TreeInfo myInfo = new TreeInfo(myDiam, myHeight);
		
		return myInfo;
		
	}
}