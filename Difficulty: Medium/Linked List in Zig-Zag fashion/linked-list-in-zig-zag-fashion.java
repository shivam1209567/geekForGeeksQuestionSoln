/* Structure of link list Node
class Node {
  public int data;
  public Node next;

  public Node(int x) {
      data = x;
      next = null;
  }
}*/
class Solution {
    public void swap(Node a){
        int temp = a.data;
        a.data  = a.next.data;
        a.next.data = temp;
    }
    public Node zigZag(Node head) {
        Node t = head;
        int idx = 0;
        while(t.next != null){
        if(idx%2 == 0){
            if(t.data >= t.next.data){
                swap(t);
               
            }
             idx++;
        }else{
            if(t.data <= t.next.data){
                swap(t);
               
            }
             idx++;
        }
        t = t.next;
        }
        return head;
    }
    
}