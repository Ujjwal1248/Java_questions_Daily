class Solution {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length + 1];
        return helper(nums, 0, 0, dp);
    }
    public int helper(int[] nums, int sum, int idx, Integer[] dp) {
        if(idx >= nums.length) return 0;
        if(dp[idx] != null) return dp[idx];
        int pick = nums[idx] + helper(nums, sum + nums[idx], idx + 2, dp);
        int notPick = helper(nums, sum, idx + 1, dp);
        return dp[idx] = Math.max(pick, notPick);
    }
}