class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int zeroes = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int j = 0; j < n; j++){
            if(nums[j] == 0) zeroes++;
            while(zeroes > k){
                if(nums[i] == 0) zeroes--;
                i++;
            }
            int len = j-i+1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}