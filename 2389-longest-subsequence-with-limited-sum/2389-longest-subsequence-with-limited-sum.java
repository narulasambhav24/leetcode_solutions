class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;
        Arrays.sort(nums);
        for(int i = 1; i < n; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int[] ans = new int[m];
        for(int i = 0; i < m; i++){
            int start = 0;
            int end = n-1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(nums[mid] > queries[i]) end = mid - 1;
                else{
                    ans[i] = Math.max(ans[i], mid+1);
                    start = mid+1;
                }

            }
        }
        return ans;
    }
}