class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
    public int helper(int[] nums, int idx, int[] dp) {
        if(idx > nums.length - 1) return 0;
        if(dp[idx] != -1) return dp[idx];
        int skip = helper(nums, idx+1, dp);
        int take = nums[idx] + helper(nums, idx+2, dp);
        dp[idx] = Math.max(skip, take);
        return dp[idx];
    }
}