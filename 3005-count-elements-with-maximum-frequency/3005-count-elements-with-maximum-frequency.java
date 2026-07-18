class Solution {
    public int maximum(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
    public int maxFrequencyElements(int[] nums) {
        int len = maximum(nums);
        int[] visited = new int[len+1];
        for(int i = 0; i < nums.length; i++){
            visited[nums[i]]++;
        }
        int max = maximum(visited);
        int count = 0;
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == max){
                count += visited[i];
            }
        }
        return count;
    }
}