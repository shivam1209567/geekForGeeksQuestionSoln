class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int k : arr){
            map.put(k, map.getOrDefault(k,0) + 1);
        }
         
        int curr = 0;
        int ans = 0;
        for(var e : map.entrySet()){
            if(e.getValue() > curr){
                curr = e.getValue();
                ans = e.getKey();
            }else if(e.getValue() == curr && e.getKey() > ans){
                ans = e.getKey();
            }
        }
        return ans;
    }
}