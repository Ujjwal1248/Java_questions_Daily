class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k > 0){
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        for(char c : st){
            ans.append(c);
        }
        if(ans.length() == 0) return "0";
        int i = 0;
        while(i < ans.length()-1 && ans.charAt(i) == '0') i++;
        return ans.substring(i);
    }
}