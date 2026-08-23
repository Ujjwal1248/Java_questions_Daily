class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> dp = new HashMap<>();
        return helper(nums, target, 0, dp);
    }
    public int helper(int[] nums, int target, int idx, HashMap<String, Integer> dp) {
        if(idx == nums.length){
            if(target == 0) return 1;
            return 0;
        }
        String key = idx + "," + target;
        if(dp.containsKey(key)) return dp.get(key); 

        int plus = helper(nums, target - nums[idx], idx + 1, dp);
        int minus = helper(nums, target + nums[idx], idx + 1, dp);

        int ans = plus + minus;
        dp.put(key, ans);
        return ans;
    }
}