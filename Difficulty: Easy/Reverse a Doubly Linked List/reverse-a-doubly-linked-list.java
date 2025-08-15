/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head == null || head.next == null) return head;
        DLLNode dummy = head;
        DLLNode temp = null;
        while(dummy != null){
            temp = dummy.prev;
            dummy.prev = dummy.next;
            dummy.next = temp;
            
            dummy = dummy.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
        return head;
    }
}