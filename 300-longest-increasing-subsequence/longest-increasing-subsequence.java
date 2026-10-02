class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp = new Integer[nums.length][nums.length + 1];
        return helper(nums, 0, -1, dp);
    }

    public int helper(int[] nums, int idx, int prev, Integer[][] dp) {
        if (idx == nums.length)
            return 0;
        if (dp[idx][prev + 1] != null)
            return dp[idx][prev + 1];
        int notPick = helper(nums, idx + 1, prev, dp);
        int pick = 0;
        if (prev == -1 || nums[idx] > nums[prev]) {
            pick = 1 + helper(nums, idx + 1, idx, dp);
        }
        return dp[idx][prev + 1] = Math.max(pick, notPick);
    }
}