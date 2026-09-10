class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int complement = target - num;
            if(map.containsKey(complement)){
                res[0] = i;
                res[1] = map.get(complement);
            }
            map.put(num, i);
        }
        return res;
    }
}