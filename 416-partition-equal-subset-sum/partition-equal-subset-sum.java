class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 == 1) return false;
        sum /= 2;
        Boolean[][] dp = new Boolean[nums.length][sum+1];
        return helper(nums, sum, 0, dp);
    }
    static boolean helper(int arr[], int sum, int idx, Boolean[][] dp) {
        if(sum == 0) return true;
        if(idx >= arr.length) return false;
        if(dp[idx][sum] != null) return dp[idx][sum];
        
        boolean notTake = helper(arr, sum, idx + 1, dp);
        boolean take = false;
        if(sum >= arr[idx]){
            take = helper(arr, sum - arr[idx], idx + 1, dp);
        }
        return dp[idx][sum] = notTake || take;
    }
}