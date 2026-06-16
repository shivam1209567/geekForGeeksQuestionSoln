class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
       
       int [] arr = new int[q.size()];
      
     
       for(int i = 0; i < arr.length; i++){
           arr[i] = q.remove();
       }
       int i = 0;
       int j = arr.length/2;
       int k = j;
       int l = 0;
       int [] arrs = new int[arr.length];
       while(i < j && k < arr.length){
           arrs[l++] = arr[i++];
           arrs[l++] = arr[k++];
       }
       for(int m = 0; m < arrs.length; m++){
           q.add(arrs[m]);
       }
      
    }
}
