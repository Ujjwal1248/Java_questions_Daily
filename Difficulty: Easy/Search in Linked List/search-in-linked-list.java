// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node dummy = head;
        for(int i = 0; i < n; i++){
            if(dummy.data == key) return true;
            dummy = dummy.next;
        }
        return false;
    }
}