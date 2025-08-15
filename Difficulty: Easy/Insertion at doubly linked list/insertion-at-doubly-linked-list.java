/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node addNode(Node head, int p, int x) {
        // code here
        Node dummy = head;
        for(int i = 0; i < p; i++){
            dummy = dummy.next;
        }
        Node nn = new Node(x);
        nn.prev = dummy;
        nn.next = dummy.next;
        if(dummy.next!=null) dummy.next.prev = nn;
        dummy.next = nn;
        return head;
    }
}