class Solution {
    public String minRemoveToMakeValid(String s) {
        int len = s.length();
        Stack<Integer> st = new Stack<>();
        boolean[] remove = new boolean[len];
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '(') st.push(i);
            else if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    remove[i] = true;
                }
            }
        }
        while(!st.isEmpty()){
            remove[st.pop()] = true;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(!remove[i]) res.append(ch);
        }
        return res.toString();
    }
}