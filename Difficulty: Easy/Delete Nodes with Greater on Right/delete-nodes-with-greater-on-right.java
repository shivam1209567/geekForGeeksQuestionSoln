/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    int min = Integer.MIN_VALUE;
    Node compute(Node head) {
        // code here
        
        if(head == null){
            return null;
        }
        head.next = compute(head.next);
        if(head.data < min){
            return head.next;
        }
            min = head.data;
            return head;
        
        
    }
}