/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node dummy0 = new Node(-1);
        Node Dummy0 = dummy0;
        Node dummy1 = new Node(-2);
        Node Dummy1 = dummy1;
        Node dummy2 = new Node(-3);
        Node Dummy2 = dummy2;
        while(head != null){
            Node next = head.next;
            head.next = null;
            if(head.data == 0){
                Dummy0.next = head;
                Dummy0 = Dummy0.next;
            }else if(head.data == 1){
                Dummy1.next = head;
                Dummy1 = Dummy1.next;
            }else{
                Dummy2.next = head;
                Dummy2 = Dummy2.next;
            }
            head = next;
        }
        
        if(dummy1.next != null){
            Dummy0.next = dummy1.next;
        }else{
            Dummy0.next = dummy2.next;
        }
        Dummy1.next = dummy2.next;
        return dummy0.next;
    }
}