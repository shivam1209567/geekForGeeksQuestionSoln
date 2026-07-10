class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(int x : arr){
            pq.add(x);
            if(pq.size() > k) arr[i++] = pq.remove();
        }
        while(pq.size()>0){
            arr[i++] = pq.remove();
        }
    }
}
