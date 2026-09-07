class Solution {
    public int minPathSum(int[][] nums) {
        int n = nums.length, m = nums[0].length;
        Integer[][] dp = new Integer[n + 1][m + 1];
        return helper(nums, m, n, 0, 0, dp);
    }

    public int helper(int[][] nums, int m, int n, int i, int j, Integer[][] dp) {
        if (i >= n || j >= m)
            return Integer.MAX_VALUE;
        if (i == n - 1 && j == m - 1) {
            return nums[i][j];
        }
        if (dp[i][j] != null)
            return dp[i][j];
        int right = Integer.MAX_VALUE, down = Integer.MAX_VALUE;
        if (i+1 < n) {
            right = nums[i][j] + helper(nums, m, n, i + 1, j, dp);
        }
        if (j+1 < m) {
            down = nums[i][j] + helper(nums, m, n, i, j + 1, dp);
        }
        return dp[i][j] = Math.min(right, down);
    }
}