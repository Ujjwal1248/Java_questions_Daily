class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[][] dp = new int[nums.length + 1][2002];
        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, target, 0, dp);
    }

    public int helper(int[] nums, int target, int idx, int[][] dp) {
        if (idx == nums.length) {
            return target==0 ? 1 : 0;
        }
        if (target < -1000 || target > 1000) return 0;
        if (dp[idx][target + 1000] != -1)
            return dp[idx][target+1000];
        int sub = helper(nums, target - nums[idx], idx + 1, dp);
        int add = helper(nums, target + nums[idx], idx + 1, dp);
        return dp[idx][target + 1000] = sub + add;
    }
}