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
        ListNode dummy = head;
        int n = size(dummy);
        int j = 0;
        int[] nums = new int[n];
        int[] ans = new int[n];
        while (dummy != null) {
            nums[j] = dummy.val;
            j++;
            dummy = dummy.next;
        }

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = 0;
            } else
                ans[i] = st.peek();
            st.push(nums[i]);
        }
        return ans;
    }

    public int size(ListNode head) {
        ListNode curr = head;
        int s = 0;
        while (curr != null) {
            s++;
            curr = curr.next;
        }
        return s;
    }

    // public ListNode reverse(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while (curr != null) {
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }
}