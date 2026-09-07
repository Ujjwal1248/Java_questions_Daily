class Solution {
    public int minimumTotal(List<List<Integer>> nums) {
        int n = nums.size(), m = nums.get(n - 1).size();
        Integer[][] dp = new Integer[n + 1][m + 1];
        return helper(nums, m, n, 0, 0, dp);
    }

    public int helper(List<List<Integer>> nums, int m, int n, int i, int j, Integer[][] dp) {
        if (i == n)
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];

        int left = nums.get(i).get(j) + helper(nums, m, n, i + 1, j, dp);
        int right = nums.get(i).get(j) + helper(nums, m, n, i + 1, j + 1, dp);

        return dp[i][j] = Math.min(left, right);
    }
}