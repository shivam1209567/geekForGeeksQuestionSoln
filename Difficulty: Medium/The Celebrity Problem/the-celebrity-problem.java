class Solution {
    public int celebrity(int mat[][]) {
        // code here
         Stack<Integer> st = new Stack<>();
         for(int i= mat.length - 1; i >= 0; i--){
             st.push(i);
         }
         while(st.size() > 1){
             int first = st.pop();
             int second = st.pop();
             if(mat[first][second] == 1 && mat[second][first] == 0){
                 st.push(second);
             }else if(mat[first][second] == 0 && mat[second][first] == 1) {
                 st.push(first);
             }
         }
    
         
         if(st.isEmpty()){
             return -1;
         }
         int row = 0;
         int col = 0;
         int num = st.pop();
        
         for(int i = 0; i < mat.length; i++){
                 
                 row += mat[num][i];
                 col += mat[i][num];
                 
             }
         
         return row == 1 && col == mat.length ? num : -1;
    }
}