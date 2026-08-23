class Solution {
    public int numSquares(int n) {
        Integer[][] dp = new Integer[n+1][(int)Math.sqrt(n) + 2];
        return helper(n, 1, dp);
    }
    public int helper(int n, int num, Integer[][] dp) {
        if(n == 0) return 0;
        if(num * num > n) return Integer.MAX_VALUE;
        if(dp[n][num] != null) return dp[n][num];

        int notTake = helper(n, num + 1, dp);
        int take = Integer.MAX_VALUE;
        if(num * num <= n){
            int result = helper(n - num * num, num, dp);
            if(result != Integer.MAX_VALUE) take = 1 + result;
        }
        return dp[n][num] = Math.min(take, notTake);
    }
}