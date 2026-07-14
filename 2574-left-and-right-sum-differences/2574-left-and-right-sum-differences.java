class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] p = new int[len];
        p[0] = 0;
        for(int i = 1; i < len; i++){
            p[i] = p[i-1] + nums[i-1];
        }
        int[] s = new int[len];
        s[len-1] = 0;
        for(int i = len-2; i >= 0; i--){
            s[i] = s[i+1] + nums[i+1];
        }
        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            ans[i] = Math.abs(p[i] - s[i]);
        }
        return ans;
    }
}