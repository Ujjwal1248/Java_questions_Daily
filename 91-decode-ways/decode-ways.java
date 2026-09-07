class Solution {
    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length()];
        return helper(s, 0, dp);
    }
    public int helper(String s, int idx, Integer[] dp){

        if(idx == s.length()) return 1;
        if(s.charAt(idx) == '0') return 0;
        if(dp[idx] != null) return dp[idx];

        int oneP = helper(s, idx +1, dp);
        int two = 0;
        if(idx + 1 < s.length()){
            int num = Integer.parseInt(s.substring(idx, idx+2));
            if(num >= 10 && num <= 26){
                two = helper(s, idx + 2, dp);
            }
        }

        return dp[idx] = oneP + two;
    }
}