/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
        Node odd = new Node(-1);
        Node odds = odd;
        Node even = new Node(-1);
        Node evens = even;
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                evens.next = temp;
                evens = temp;
                temp = temp.next;
            }else{
                odds.next = temp;
                odds = temp;
                temp = temp.next;
            }
        }
        
        even = even.next;
        odd = odd.next;
        if(odd != null){
            odds.next = null;
            
        }
        if(even != null){
            evens.next = odd;
        }
        
        if(even == null){
            return odd;
        }else{
            return even;
        }
    }
    
}