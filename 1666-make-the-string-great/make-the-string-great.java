class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                char top = st.peek();
                if(ch == top || Character.toLowerCase(top) != Character.toLowerCase(ch)){
                    st.push(ch);
                }
                else{
                    st.pop();
                }
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        return ans;
    }
}