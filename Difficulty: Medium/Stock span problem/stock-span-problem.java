class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<int[]> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            int sum = 1;
            while(!st.isEmpty() && st.peek()[0] <= arr[i]){
                sum += st.pop()[1];
                
            }
            st.push(new int []{arr[i], sum});
            list.add(sum);
        }
        return list;
    }
}