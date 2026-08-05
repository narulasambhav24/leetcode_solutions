class Solution {
    public int subarraySum(int[] nums, int k) {
        // this approach uses a time complexity of O(n^2)
        // int count = 0;
        // int len = nums.length;
        // for(int i = 0; i < len; i++){
        //     int sum = 0;
        //     for(int j = i; j < len; j++){
        //         sum += nums[j];
        //         if(sum == k) count++;
        //     }
        // }
        // return count;
        int n = nums.length, count = 0;
        for(int i = 1; i < n; i++){
            nums[i] += nums[i-1];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int ele = nums[i];
            if(ele == k) count++;
            int rem = ele - k;
            if(map.containsKey(rem)) count += map.get(rem);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else{
                map.put(ele, 1);
            }
        }
        return count;
    }
}