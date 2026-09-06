class Solution {
    public int rob(int[] nums) {
        
        Integer[] dp1 = new Integer[nums.length + 1];
        Integer[] dp2 = new Integer[nums.length + 1];
        int n = nums.length;

        if (n == 1) return nums[0];

        return Math.max(helper(nums, 0, n - 2, dp1), helper(nums, 1, n - 1, dp2));
    }

    public int helper(int[] nums, int idx, int end, Integer[] dp) {
        if (idx > end) return 0;
        if (dp[idx] != null) return dp[idx];

        int notPick = helper(nums, idx + 1, end, dp);
        int pick = nums[idx] + helper(nums, idx + 2, end, dp);

        return dp[idx] = Math.max(pick, notPick);
    }
}