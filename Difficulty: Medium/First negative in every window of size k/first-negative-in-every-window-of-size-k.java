class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                q.add(i);
            }
        }
        
        int t = 0;
        for(int i = 0; i <= arr.length - k; i++){
           while(!q.isEmpty() && q.peek() < i){
               q.remove();
           }
           if(q.isEmpty() || q.peek() > i+k-1){
               list.add(0);
           }else{
               list.add(arr[q.peek()]);
           }
        }
        return list;
    } 
}