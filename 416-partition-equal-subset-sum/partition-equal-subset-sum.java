class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
        }
        if(sum % 2 == 1) return false;
        sum/=2;
        int[][] dp = new int[nums.length+1][sum+1];
        for(int i = 0; i<=nums.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, 0, 0, sum, dp);
    }

    public boolean helper(int[] nums, int sum1, int idx, int sum, int[][] dp) {
        if (sum == sum1){
            dp[idx][sum1] = 1;
            return true;
        }
        if (idx >= nums.length || sum1 > sum){
            return false;
        }
        if(dp[idx][sum1] == 1) return true;
        else if(dp[idx][sum1] == 0) return false;
        boolean ans1 = helper(nums, sum1 + nums[idx], idx + 1, sum, dp);
        boolean ans2 = helper(nums, sum1, idx + 1, sum, dp);
        if(ans1 == true || ans2 == true) dp[idx][sum1] = 1;
        else dp[idx][sum1] = 0;
        return ans1 || ans2;
    }
}