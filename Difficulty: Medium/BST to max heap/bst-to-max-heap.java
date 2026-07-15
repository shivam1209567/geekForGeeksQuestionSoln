class Solution {
    static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    static void preorder(Node root,Queue<Integer> qu){
        if(root == null) return;
        if(root.left != null) preorder(root.left,qu);
        qu.offer(root.data);
        if(root.right != null) preorder(root.right,qu);
    }
    static void maxHeap(Node root,Queue<Integer> qu){
        if(root == null || qu.isEmpty()) return;
        if(!qu.isEmpty())maxHeap(root.left,qu);
        if(!qu.isEmpty())maxHeap(root.right,qu);
        if(!qu.isEmpty())root.data = qu.remove();
    }
    public static void convertToMaxHeapUtil(Node root) {
        Queue<Integer> qu = new LinkedList<>();
        int x = size(root);
        preorder(root,qu);
        maxHeap(root,qu);
        
    }
}