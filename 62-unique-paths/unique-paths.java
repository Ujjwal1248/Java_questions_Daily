class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[n + 1][m + 1];
        return helper(m, n, 0, 0, dp);
    }

    public int helper(int m, int n, int i, int j, Integer[][] dp) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i > n || j > m)
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        int right = 0, down = 0;
        if (i < n) {
            right = helper(m, n, i + 1, j, dp);
        }
        if (j < m) {
            down = helper(m, n, i, j + 1, dp);
        }
        return dp[i][j] = right + down;
    }
}