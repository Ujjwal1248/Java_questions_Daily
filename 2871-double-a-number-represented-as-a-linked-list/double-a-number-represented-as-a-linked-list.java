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
        ListNode head1 = head;
        ListNode head2= reverse(head1);
        ListNode head3 = helper(head2);
        return reverse(head3);
    }
    public ListNode helper(ListNode head){
        ListNode curr = head;
        int carry = 0;
        ListNode prev = null;
        while(curr != null){
            int val = curr.val * 2 + carry;
            int sum = val%10;
            carry = val/10;
            curr.val = sum;
            prev = curr;
            curr=curr.next;
        }
        if(carry == 0) return head;
        prev.next = new ListNode(carry);
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
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