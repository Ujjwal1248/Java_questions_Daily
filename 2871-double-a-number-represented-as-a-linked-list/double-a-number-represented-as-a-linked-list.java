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
        ListNode dummy = head;
        ListNode dummy2 =reverse(dummy);
        ListNode dummy3 = helper(dummy2);
        return reverse(dummy3);
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev= null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode helper(ListNode head){
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr= dummy;
        while(head != null || carry !=0){
            int sum = carry;
            if(head!=null){
                sum = sum + 2*head.val;
                head = head.next;
            }
            carry = sum / 10;
            sum = sum %10;
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        return dummy.next;

    }
}