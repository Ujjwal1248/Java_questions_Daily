class Solution {
    public int maxProfit(int[] nums) {
        int min = nums[0];
        int maxPro = Integer.MIN_VALUE;
        for(int num : nums){
            maxPro = Math.max(maxPro, num - min);
            min = Math.min(min, num);
        }
        return maxPro;
    }
}