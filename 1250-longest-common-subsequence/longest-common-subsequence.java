class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length(), m =t2.length();
        Integer[][] dp  = new Integer[n][m];
        return helper(t1, t2, 0, 0, dp);
    }
    public int helper(String t1, String t2, int i, int j, Integer[][] dp) {
        if(i == t1.length() || j==t2.length()) return 0;
        if(dp[i][j] != null) return dp[i][j];
        int ans = 0;
        if(t1.charAt(i) == t2.charAt(j)){
            ans = 1 + helper(t1, t2, i+1, j+1, dp);
        }
        else{
            int firstR = helper(t1, t2, i+1, j, dp);
            int secondR = helper(t1, t2, i, j+1, dp);
            ans = Math.max(firstR, secondR);
        }

        return dp[i][j] = ans;
    }
}