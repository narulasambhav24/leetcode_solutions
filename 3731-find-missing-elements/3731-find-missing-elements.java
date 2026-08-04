class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int smallest = nums[0];
        int largest = nums[n-1];
        int i = 0;
        while(smallest <= largest){
            if(nums[i] == smallest){
                i++;
                smallest++;
            }
            else{
                ans.add(smallest);
                smallest++;
            }
        }
        return ans;
    }
}