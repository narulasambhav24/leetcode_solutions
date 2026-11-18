class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int rIndex = n - 1;
        int rSum = 0;
        int lSum = 0;
        for(int i = 0; i < k; i++){
            lSum = lSum + cardPoints[i];
        }
        int maxSum = lSum;
        for(int i = k-1; i >= 0; i--){
            lSum = lSum - cardPoints[i];
            rSum = rSum + cardPoints[rIndex];
            rIndex--;
            maxSum = Math.max(maxSum, rSum + lSum);
        }
        return maxSum;
    }
}