class Solution {
    // public static int cnt = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = helper(coins, amount, dp);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    public int helper(int[] nums, int target, int[] dp) {
        if (target < 0)
            return Integer.MAX_VALUE;
        if (target == 0){ 
            return 0;
        }
        if(dp[target] != -1) return dp[target];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, helper(nums, target - nums[i], dp));
        }
        if(min == Integer.MAX_VALUE) return dp[target] = Integer.MAX_VALUE;
        return dp[target] = min + 1;
    }
}