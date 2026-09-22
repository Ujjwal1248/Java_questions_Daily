class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit = 0;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxProfit = Math.max(maxProfit, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        return maxProfit;
    }
}