class Solution {
    public String reverse(String word){
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String s = words[i];
            String reversedS = reverse(s);
            if(set.contains(reversedS)){
                count++;
                set.remove(reversedS);
            }
            else{
                set.add(s);
            }
        }
        return count;
    }
}