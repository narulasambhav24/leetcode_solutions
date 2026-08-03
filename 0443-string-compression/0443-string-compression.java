class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int len = chars.length;
        int i = 0, j = 0;
        while(j < len){
            if(chars[i] == chars[j]) j++;
            else{
                sb.append(chars[i]);
                int l = j - i;
                if(l > 1) sb.append(l);
                i = j;
            }
        }
        sb.append(chars[i]);
        int l = j - i;
        if(l > 1) sb.append(l);
        for(i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}