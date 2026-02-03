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
        ListNode dummy2 = reverse(dummy);
        return helper(dummy2);
    }

    public int[] helper(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            while (!st.isEmpty() && st.peek() <= head.val) {
                st.pop();
            }
            if (st.isEmpty())
                arr.add(0);
            else
                arr.add(st.peek());
            st.push(head.val);
            head = head.next;
        }
        int n = arr.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr.get(n - 1 - i);
        }
        return ans;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}