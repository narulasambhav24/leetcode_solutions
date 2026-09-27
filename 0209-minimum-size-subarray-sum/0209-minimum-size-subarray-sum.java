class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int minLen = Integer.MAX_VALUE;
        int currSum = 0;
        while(j < n && currSum < target){
            currSum += nums[j++];
        }
        j--;
        while(i < n && j < n){
            int len = j-i+1;
            if(currSum >= target) minLen = Math.min(minLen, len);
            currSum -= nums[i];
            i++; j++;
            while(j < n && currSum < target){
                currSum += nums[j++];
            }
            j--;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}