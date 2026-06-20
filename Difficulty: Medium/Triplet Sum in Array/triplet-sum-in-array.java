class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        // for(int i = 0; i < arr.length-2; i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j = i+1; j < arr.length; j++){
        //         set.add(arr[j]);
        //         int sum = target-arr[i]-arr[j];
        //         if(set.contains(sum)) return true;
        //     }
        // }
        // return false;
        int n = arr.length;
        for(int i = 0; i < n - 2; i++) {
    HashSet<Integer> set = new HashSet<>();

    for(int j = i + 1; j < n; j++) {
        int req = target - arr[i] - arr[j];

        if(set.contains(req)) {
            return true;
        }

        set.add(arr[j]);
    }
}

return false;
    }
}
