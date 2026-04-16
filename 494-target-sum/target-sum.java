class Solution {
    public int cnt = 0;
    public int findTargetSumWays(int[] nums, int target) {
        //int[] dp = new int[target+1];
        helper(nums, target, 0);
        return cnt;
    }
    public void helper(int[] nums, int target, int idx) {
        if (idx == nums.length && target == 0) {
            cnt++;
            return;
        }
        if (idx == nums.length)
            return;
        // if(dp[target] != -1) return dp[target];
        helper(nums, target - nums[idx], idx + 1);
        helper(nums, target + nums[idx], idx + 1);
    }
}