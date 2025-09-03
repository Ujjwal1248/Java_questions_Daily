class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robber(nums,0,dp);
    }

    public int robber(int[] nums, int i, int[] dp) {
        if (i >= nums.length)
            return 0;
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + robber(nums, i+2, dp);
        int Dont_rob = robber(nums, i + 1, dp);
        return dp[i] = Math.max(rob, Dont_rob);
    }
}