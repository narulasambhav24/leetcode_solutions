class Solution {
    public int reverseDegree(String s) {
        int len = s.length();
        int sum = 0;
        int[] alphabet = new int[26];
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            int value = 'z' - ch + 1;
            sum += value * (i+1);
        }
        return sum;
    }
}