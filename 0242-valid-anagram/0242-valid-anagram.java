class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            char ch = arr1[i];
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else{
                map1.put(ch, 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < arr2.length; i++){
            char ch2 = arr2[i];
            if(map2.containsKey(ch2)){
                map2.put(ch2, map2.get(ch2)+1);
            }
            else{
                map2.put(ch2, 1);
            }
        }
        for(char key : map1.keySet()){
            int val1 = map1.get(key);
            if(!map2.containsKey(key)) return false;
            int val2 = map2.get(key);
            if(val1 != val2) return false;
        }
        return true;
    }
}