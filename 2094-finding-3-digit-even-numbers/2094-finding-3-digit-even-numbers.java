class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int digit : digits){
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        for(int i = 100; i <= 998; i += 2){
            int num = i;
            boolean have = true;
            List<Integer> used = new ArrayList<>();
            while(num != 0){
                int ones = num % 10;
                if(!map.containsKey(ones) || map.get(ones) == 0){
                    have = false;
                    break;
                }
                map.put(ones, map.get(ones)-1);
                used.add(ones);
                num /= 10;
            }
            for(int digit : used){
                map.put(digit, map.get(digit) + 1);
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