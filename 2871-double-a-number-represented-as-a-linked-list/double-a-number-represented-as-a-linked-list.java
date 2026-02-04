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
    public ListNode doubleIt(ListNode head) {
        ListNode rev = reverse(head);
        ListNode h1 = helper(rev);
        return reverse(h1);
    }
    public ListNode helper(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        int carry = 0;
        while(curr != null){
            int value = carry + (curr.val * 2);
            int sum = value % 10;
            curr.val = sum;
            carry = value / 10;
            prev = curr;
            curr = curr.next;
        }
        if(carry > 0){
            prev.next = new ListNode(carry);
        }
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode curr= head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}