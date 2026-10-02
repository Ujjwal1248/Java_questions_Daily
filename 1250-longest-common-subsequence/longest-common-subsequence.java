class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        return helper(text1, text2, 0, 0, dp);
    }

    public int helper(String t1, String t2, int i, int j, Integer[][] dp) {
        if (i == t1.length() || j == t2.length())
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        int ans = 0;
        if (t1.charAt(i) == t2.charAt(j)) {
            ans = 1 + helper(t1, t2, i + 1, j + 1, dp);
        } else {
            int c1 = helper(t1, t2, i + 1, j, dp);
            int c2 = helper(t1, t2, i, j + 1, dp);
            ans = Math.max(c1, c2);
        }
        return dp[i][j] = ans;
    }
}