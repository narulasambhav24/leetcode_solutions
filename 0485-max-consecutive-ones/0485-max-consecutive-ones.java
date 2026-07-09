class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int ele : nums){
            if(ele == 0) count = 0;
            else{
                count++;
            }
            max = Math.max(max, count);

        }
        return max;
    }
}