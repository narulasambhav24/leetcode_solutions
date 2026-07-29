class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n  = nums.length;
        long[] temp = new long[n];
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maximum = Math.max(maximum, nums[i]);
            temp[i] = nums[i] + maximum;
        }
        for(int i = 1; i < n; i++){
            temp[i] = temp[i] + temp[i-1]; 
        }
        return temp;
    }
}