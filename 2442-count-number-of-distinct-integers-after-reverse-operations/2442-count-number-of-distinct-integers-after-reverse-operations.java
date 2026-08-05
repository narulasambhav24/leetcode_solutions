class Solution {
    public int reverseNumber(int n){
        if(n >= 0 && n < 10){
            return n;
        }
        int ans = 0;
        while(n != 0){
            int digit = n%10;
            ans = (ans * 10) + digit;
            n/=10;
        }
        return ans;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int ele = nums[i];
            int reverse = reverseNumber(ele);
            set.add(ele);
            set.add(reverse);
        }
        return set.size();
    }
}