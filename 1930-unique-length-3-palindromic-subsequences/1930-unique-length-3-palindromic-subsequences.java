class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> fMap = new HashMap<>();
        HashMap<Character, Integer> lMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!fMap.containsKey(ch)){
                fMap.put(ch, i);
            }
            lMap.put(ch, i);
        }
        int count = 0;
        for(char ch : fMap.keySet()){
            int firstOcc = fMap.get(ch);
            int lastOcc = lMap.get(ch);
            HashSet<Character> set = new HashSet<>();
            for(int i = firstOcc + 1; i < lastOcc; i++){
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
}