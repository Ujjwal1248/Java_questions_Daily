class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        // int[] arr = s.toCharArray();
        // st.push(arr[0]);
        // for(int)
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{')
                st.push(curr);
            else {
                if (st.isEmpty())
                    return false;
                char stop = st.peek();
                if (stop == '(' && curr == ')')
                    st.pop();
                else if (stop == '{' && curr == '}')
                    st.pop();
                else if (stop == '[' && curr == ']')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty() ? true : false;
    }
}