class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int j = 0; j < n; j++){
            int i = j+1;
            if(n % i == 0){
                sum += nums[j] * nums[j];
            }
        }
        return sum;
    }
}