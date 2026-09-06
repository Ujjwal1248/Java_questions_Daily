class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp = new Integer[cost.length+1];
        return Math.min(helper(cost, 0, dp), helper(cost, 1, dp));
    }
    public int helper(int[] cost, int idx, Integer[] dp) {
        if(idx >= cost.length) return 0;
        if(dp[idx] != null) return dp[idx];
        int left = helper(cost, idx + 1,dp);
        int right = helper(cost, idx + 2,dp);
        return dp[idx] = cost[idx] + Math.min(left, right);
    }
}