/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    void helper(Node root,ArrayList<Node> list){
        if(root == null){
            return;
        }
        helper(root.left,list);
        
        list.add(root);
        helper(root.right,list);
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> list = new ArrayList<>();
        helper(root,list);
        Node  ans1 = new Node(Integer.MIN_VALUE);
        Node ans2 = new Node(Integer.MAX_VALUE);
        if(key <= list.get(0).data) ans1 = null;
        if(key >= list.get(list.size() - 1).data) ans2 = null;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).data < key && ans1.data < list.get(i).data){
                
                 ans1 = list.get(i);
            }
            if(list.get(i).data > key && ans2.data > list.get(i).data){
                
                ans2 = list.get(i);
            }
        }
        ArrayList<Node> list1 = new ArrayList<>();
        list1.add(ans1);
        list1.add(ans2);
        return list1;
    }
}