class Solution {
    public int[] prefix(int[] arr, int len){
        int[] p = new int[len];
        p[0] = 1;
        for(int i = 1; i < len; i++){
            p[i] = p[i-1] * arr[i-1];
        }
        return p;
    }
    public int[] suffix(int[] arr, int len){
        int[] s = new int[len];
        s[len-1] = 1;
        for(int i = len-2; i >= 0; i--){
            s[i] = s[i+1] * arr[i+1];
        }
        return s;
    }
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] pre = prefix(nums, size);
        int[] suff = suffix(nums, size);

        int[] ans = new int[size];
        for(int i = 0; i < size; i++){
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
}