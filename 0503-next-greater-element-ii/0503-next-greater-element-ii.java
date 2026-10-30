class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] arr = new int[n*2];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
        }
        for(int j = 0; j < n; j++){
            arr[j+n] = nums[j];
        }
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            int ele = arr[i];
            while(!st.isEmpty() && st.peek() <= ele){
                st.pop();
            }
            if(st.isEmpty()){
                res[i%n] = -1;
            }
            else{
                res[i%n] = st.peek();
            }
            st.push(ele);
        }
        return res;
    }
}