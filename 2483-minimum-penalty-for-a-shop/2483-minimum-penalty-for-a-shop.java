class Solution {
    public int bestClosingTime(String customers) {
        int len = customers.length();
        int[] prefix = new int[len+1];
        for(int i = 1; i <= len; i++){
            prefix[i] += prefix[i-1];
            if(customers.charAt(i-1) == 'N'){
                prefix[i] += 1;
            }
        }
        int[] suffix = new int[len+1];
        for(int i = len-1; i>= 0;i--){
            suffix[i] = suffix[i+1];
            if(customers.charAt(i) == 'Y'){
                suffix[i] += 1;
            }
        }
        int[] penalty = new int[len+1];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= len; i++){
            penalty[i] = prefix[i] + suffix[i];
            min = Math.min(min, penalty[i]);
        }
        for(int i = 0; i <= len; i++){
            if(penalty[i] == min) return i;
        }
        return 1;
    }
}