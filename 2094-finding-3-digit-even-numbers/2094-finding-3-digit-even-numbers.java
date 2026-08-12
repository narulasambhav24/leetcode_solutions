class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < digits.length; i++){
            map.put(digits[i], map.getOrDefault(digits[i], 0) + 1);
        }
        for(int i = 100; i <= 998; i+=2){
            int candidate = i;
            boolean have = true;
            List<Integer> used = new ArrayList<>();
            while(candidate != 0){
                int digit = candidate % 10;
                if(!map.containsKey(digit) || map.get(digit) == 0){
                    have = false;
                    break;
                }
                map.put(digit, map.get(digit)-1);
                used.add(digit);
                candidate/=10;
            }
            for(int ele : used){
            map.put(ele, map.get(ele) + 1);
            }
            if(have) res.add(i);
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}