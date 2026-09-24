class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int average = 0;
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        average = sum / k;
        if(average >= threshold) count++;
        int i = 1, j = k;
        while(j < n){
            sum = sum - arr[i-1] + arr[j];
            average = sum / k;
            if(average >= threshold) count++;
            i++;
            j++;
        }
        return count;
    }
}