class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        map.put(sum,-1);
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                
                max = Math.max(max,i - map.get(sum));
                
                continue;
            }
            map.put(sum,i);
            
        }
        if(map.size() == arr.length+1) return 0;
        return max;
        
    }
}