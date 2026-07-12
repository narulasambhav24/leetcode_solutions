class Solution {
    public void reverseArray(int[] arr, int startIdx, int endIdx){
        while(startIdx <= endIdx){
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        reverseArray(nums, 0, size-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, size-1);
    }
}