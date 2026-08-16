class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int ele = arr[i] % k;
            if(ele < 0) ele += k;
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        if(map.containsKey(0)){
            if(map.get(0) % 2 != 0) return false;
            map.remove(0);
        }
        if(k % 2 == 0 && map.containsKey(k/2)){
            if(map.get(k/2) % 2 != 0) return false;
            map.remove(k/2);
        }
        for(int key : map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem)) return false;
            int remFreq = map.get(rem);
            int keyFreq = map.get(key);
            if(remFreq != keyFreq) return false;
        }
        return true;
    }
}