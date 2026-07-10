class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : arr){
            pq.add(x);
        }
        int sum = 0;
        while(pq.size() > 1){
            int ans = 0;
            int x = pq.remove();
            int y = pq.remove();
            ans = x+y;
            pq.add(ans);
            sum+=ans;
            if(pq.size() == 1){
              
                break;
            }
        }
        return sum;
    }
}