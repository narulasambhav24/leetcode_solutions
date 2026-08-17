class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int maxDist = 0;
        int currPos = 0;
        for(int i = 0; i < nums.length-1; i++){
            maxDist = Math.max(maxDist, i + nums[i]);
            if(i == currPos){
                jumps++;
                currPos = maxDist;
            }
        }
        return jumps;
    }
}