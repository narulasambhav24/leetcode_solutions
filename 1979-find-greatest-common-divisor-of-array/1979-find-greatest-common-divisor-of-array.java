class Solution {
    public int gcd(int i, int j){
        if(j == 0){
            return i;
        }
        return gcd(j, i%j);
    }
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        return gcd(mini, maxi);
    }
}