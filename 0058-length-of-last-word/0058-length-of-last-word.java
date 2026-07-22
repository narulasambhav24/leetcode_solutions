class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int i = str.length() - 1;
        int len = 0;
        while(i >= 0){
            if(str.charAt(i) == ' '){
                break;
            }
            else{
                len++;
                i--;
            }
        }
        return len;
    }
}