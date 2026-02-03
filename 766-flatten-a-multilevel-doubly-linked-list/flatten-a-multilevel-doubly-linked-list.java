/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node child = curr.child;
                curr.next = child;
                child.prev = curr;
                curr.child = null;
                while (child.next != null) child = child.next;
                if (next != null) next.prev = child;
                child.next = next;
            }
            curr = curr.next;
        }
        return head;
    }
}