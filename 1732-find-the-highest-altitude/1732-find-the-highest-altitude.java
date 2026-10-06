class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = Integer.MIN_VALUE;
        int size = gain.length;
        int[] prefix = new int[size+1];
        prefix[0] = 0;
        for(int i = 1; i < size+1; i++){
            prefix[i] = prefix[i-1] + gain[i-1];
        }
        for(int i = 0; i < prefix.length; i++){
            maxAlt = Math.max(maxAlt, prefix[i]);
        }
        return maxAlt;
    }
}