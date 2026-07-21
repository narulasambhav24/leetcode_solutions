class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String res = s+s;
        return res.substring(1, res.length() - 1).contains(s);
    }
}