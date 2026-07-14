class Solution {
    int size(Node tree){
        if(tree == null) return 0;
        return 1+size(tree.left)+size(tree.right);
    }
    boolean isCBT(Node tree,int size,int n){
        if(tree == null) return true;
        if(n > size) return false;
        return isCBT(tree.left,size,n*2)&&isCBT(tree.right,size,n*2+1);
        
    }
    boolean isMaxHeap(Node tree){
        if(tree == null) return true;
        if(tree.left == null && tree.right != null) return false;
        if(tree.left != null) {
        if(tree.data < tree.left.data) return false;
        }
        if(tree.right != null){
        if(tree.data < tree.right.data) return false;
        }
        return isMaxHeap(tree.left) && isMaxHeap(tree.right);
    }
    public boolean isHeap(Node tree) {
        int x = size(tree);
        return isMaxHeap(tree) && isCBT(tree,x,1);
    }
}