class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(m, n, 0, 0, dp, grid);
    }

    public static int helper(int m, int n, int i, int j, int[][] dp, int[][] grid) {
        if (i >= m || j >= n)
            return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        int down = helper(m, n, i + 1, j, dp, grid);
        int right = helper(m, n, i, j + 1, dp, grid);
        int min = Math.min(down, right);

        if(min == Integer.MAX_VALUE) return dp[i][j] = min;
        return dp[i][j] = grid[i][j] + min;
    }
}