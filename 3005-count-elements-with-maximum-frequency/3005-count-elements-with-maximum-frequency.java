class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int ele = nums[i];
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else{
                map.put(ele, 1);
            }
        }
        int maxFreq = 0;
        for(int freq : map.values()){
            maxFreq = Math.max(maxFreq, freq);
        }
        int ans = 0;
        for(int freq : map.values()){
            if(freq == maxFreq){
                ans += freq;
            }
        }
        return ans;
    }
}