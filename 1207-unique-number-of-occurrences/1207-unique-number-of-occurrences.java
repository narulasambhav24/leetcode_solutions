class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int ele = arr[i];
            if(map.containsKey(ele)){
                int updated = map.get(ele) + 1;
                map.put(ele, updated);
            }
            else{
                map.put(ele, 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            int value = map.get(key);
            set.add(value);
        }
        if(map.size() != set.size()) return false;
        else return true;
    
    }
}