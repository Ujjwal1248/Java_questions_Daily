class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp = new Integer[coins.length + 1][amount + 1];
        int ans = helper(coins, amount, 0, dp);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
    public int helper(int[] coins, int amount, int idx, Integer[][] dp) {
        if(idx >= coins.length || amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return 0;
        if(dp[idx][amount] != null) return dp[idx][amount];

        int pick = Integer.MAX_VALUE;
        if(amount >= coins[idx]){
            int res = helper(coins, amount - coins[idx], idx, dp);
            pick = (res != Integer.MAX_VALUE) ? 1 + res : Integer.MAX_VALUE;
        }
        int notPick = helper(coins, amount, idx+1, dp);
        return dp[idx][amount] =Math.min(pick, notPick);
    }
}