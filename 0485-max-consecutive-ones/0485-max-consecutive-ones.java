class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int prevMaxCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = count;
            }
            else{
                prevMaxCount = maxCount;
                count = 0;
            }
            if(prevMaxCount > maxCount){
                maxCount = prevMaxCount;
            }
        }
        return maxCount;
    }
}