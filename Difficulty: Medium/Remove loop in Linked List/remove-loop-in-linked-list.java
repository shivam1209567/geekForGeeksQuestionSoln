/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {

        Node ka = head;
        Node kh = head;

        boolean loopFound = false;

        while(kh != null && kh.next != null){
            ka = ka.next;
            kh = kh.next.next;

            if(ka == kh){
                loopFound = true;
                break;
            }
        }

        if(!loopFound){
            return;
        }

        Node temp = head;

        // Special case: loop starts at head
        if(temp == ka){
            while(ka.next != temp){
                ka = ka.next;
            }
            ka.next = null;
            return;
        }

        while(temp.next != ka.next){
            temp = temp.next;
            ka = ka.next;
        }

        ka.next = null;
    }
}