class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) return null;

        // Case: delete head
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Traverse to x-th node
        Node dummy = head;
        for (int i = 1; i < x && dummy != null; i++) {
            dummy = dummy.next;
        }

        if (dummy == null) return head; // invalid position

        Node prev = dummy.prev;
        Node front = dummy.next;

        if (front == null) {
            // last node
            if (prev != null) prev.next = null;
            dummy.prev = null;
        } else {
            // middle node
            if (prev != null) prev.next = front;
            front.prev = prev;
        }

        // Disconnect deleted node
        dummy.next = null;
        dummy.prev = null;

        return head;
    }
}
