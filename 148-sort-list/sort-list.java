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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = mid(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        left = sortList(head);
        right = sortList(right);
        return sort(left, right);
    }
    public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sort(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1, null);
        ListNode temp = dummy;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                t1 = t1.next;
            }else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1 != null){
            temp.next = t1;
        }
        else if(t2 != null){
            temp.next = t2;
        }
        return dummy.next;
    }
}