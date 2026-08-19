class Solution {
    public int maxOperations(int[] nums, int k) {
        int validPair = 0;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while(left < right){
            int currSum = nums[left] + nums[right];
            if(currSum == k){
                validPair++;
                left++;
                right--;
            }
            else if(currSum < k){
                left++;
            }
            else{
                right--;
            }
        }
        return validPair;
    }
}