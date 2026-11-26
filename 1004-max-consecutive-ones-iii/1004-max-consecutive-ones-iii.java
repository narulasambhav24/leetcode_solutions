class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0, zeroes = 0;
        int maxLen = 0;
        while(j < n){
            if(nums[j] == 0) zeroes++;
            while(zeroes > k){
                if(nums[i] == 0){
                    zeroes--;
                }
                i++;
            }
            int len = j-i+1;
            maxLen = Math.max(maxLen, len);
            j++;
        }
        return maxLen;
    }
}