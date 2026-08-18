class Solution {
    public int rev(int n){
        int ans = 0;
        while(n != 0){
            ans = ans*10 + n%10;
            n/=10;
        }
        return ans;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int key = nums[i] - rev(nums[i]);
            if(map.containsKey(key)){
                count += map.get(key);
                count %= 1000000007;
                map.put(key, map.get(key) + 1);
            }
            else{
                map.put(key, 1);
            }
        }
        return count;
    }
}