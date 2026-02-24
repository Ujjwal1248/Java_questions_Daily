class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        memo[nums.length-1] = nums[nums.length-1];
        return helper(nums, 0, memo);
    }
    public int helper(int[] nums, int i, int[] memo){
        //if(i == nums.length - 1) return nums[i]; 
        if(i >= nums.length) return 0;
        if(memo[i] != -1) return memo[i];
        int res1 = nums[i] + helper(nums, i+2, memo);
        int res2 = helper(nums, i+1, memo);
        memo[i] = Math.max(res1, res2);
        return memo[i];
    }
}