class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int orgSum = len * (len + 1) / 2;
        int arrSum = 0;
        for(int i = 0; i < nums.length; i++){
            arrSum += nums[i];
        }
        return orgSum - arrSum;
    }
}