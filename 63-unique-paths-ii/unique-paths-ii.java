class Solution {
    public int uniquePathsWithObstacles(int[][] nums) {
        int n = nums.length, m = nums[0].length;
        if(nums[n-1][m-1] == 1) return 0;
        Integer[][] dp = new Integer[n + 1][m + 1];
        return helper(nums, m, n, 0, 0, dp);
    }

    public int helper(int[][] nums, int m, int n, int i, int j, Integer[][] dp) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m)
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        int right = 0, down = 0;
        if (i < n && nums[i][j] != 1) {
            right = helper(nums, m, n, i + 1, j, dp);
        }
        if (j < m && nums[i][j] != 1) {
            down = helper(nums, m, n, i, j + 1, dp);
        }
        return dp[i][j] = right + down;
    }
}