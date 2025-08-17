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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextNode;
        ListNode prevNode = null;
        while(temp != null){
            ListNode kthNode = findk(temp, k);
            if(kthNode == null){
                if(prevNode != null) prevNode.next = temp;
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head){
                head = kthNode;
            }
            else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        } 
        return head; 
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public ListNode findk(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode curr = head;
        int count = 1;
        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }
        if(count == k){
            return curr;
        }
        else{
            return null;
        }
    }
}