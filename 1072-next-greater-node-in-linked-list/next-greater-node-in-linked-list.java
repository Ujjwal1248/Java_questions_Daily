/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        int n = 0;
        while (curr != null) {
            curr = curr.next;
            n++;
        }
        int[] nums = new int[n];
        ListNode curr1 = head;
        int i = 0;
        while (curr1 != null) {
            nums[i] = curr1.val;
            curr1 = curr1.next;
            i++;
        }
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int j = n - 1; j >= 0; j--) {
            while (!st.isEmpty() && st.peek() <= nums[j]) {
                st.pop();
            }
            if(st.isEmpty()) ans[j] = 0;
            else ans[j] = st.peek();
            st.push(nums[j]);
        }
        return ans;
    }
}