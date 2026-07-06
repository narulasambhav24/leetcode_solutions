class Solution {
    public int[] helper(int[] arr){
        int len = arr.length;
        int[] nge = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i = len - 1; i >= 0; i--){
            int ele = arr[i];
            while(!st.isEmpty() && st.peek() <= ele){
                st.pop();
            }
            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        return nge;
    }
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int newLength = nums.length*2;
        int[] temp = new int[newLength];
        for(int i = 0; i < len; i++){
            temp[i] = nums[i];
        }
        for(int i = 0; i < len; i++){
            temp[i+len] = nums[i];
        }
        int[] nge = helper(temp);
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            res[i] = nge[i];
        }
        return res;
    }
}