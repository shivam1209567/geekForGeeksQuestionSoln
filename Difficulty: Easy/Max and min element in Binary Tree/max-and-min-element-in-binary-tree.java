/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public static int findMax(Node root) {
        // code here
        if(root == null) return 0;
        int a = root.data;
        return Math.max(a,Math.max(findMax(root.left), findMax(root.right)));
    }

    public static int findMin(Node root) {
        
        // code here
        if(root == null) return Integer.MAX_VALUE;
        int a = root.data;
        return Math.min(a,Math.min(findMin(root.left), findMin(root.right)));
    }
}