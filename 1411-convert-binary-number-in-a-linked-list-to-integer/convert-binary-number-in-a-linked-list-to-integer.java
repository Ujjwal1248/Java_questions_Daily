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
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        return helper(node);
    }

    public int helper(ListNode head){
        int num = 0;
        while(head != null){
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }
}