/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node merge(Node l1,Node l2){
        Node d = new Node(-1);
        Node t = d;
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                Node T = new Node(l1.data);
                t.bottom = T;
                t = T;
                l1 = l1.bottom;
            }else{
                Node T = new Node(l2.data);
                
                t.bottom = T;
                t = T;
                l2 = l2.bottom;
            }
            
        }
        if(l1 !=null) t.bottom = l1;
        if(l2 != null) t.bottom = l2;
        return d.bottom;
    }
    public Node flatten(Node root) {
        if(root == null || root.next == null){
            return root;
        }
        Node mergedHead = flatten(root.next);
        root = merge(root,mergedHead);
        return root;
    }
}