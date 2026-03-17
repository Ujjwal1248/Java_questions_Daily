class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans1 = helper(nums, 0, n-2, dp);
        Arrays.fill(dp, -1);
        int ans2 = helper(nums, 1, n-1, dp);
        return Math.max(ans1, ans2);
    }
    public int helper(int[] nums, int idx, int end, int[] dp){
        if(idx > end) return 0;
        if(dp[idx] != -1) return dp[idx];

        int skip = helper(nums, idx + 1, end, dp);
        int take = nums[idx] + helper(nums, idx + 2, end, dp);

        return dp[idx] = Math.max(skip, take);
    }
}