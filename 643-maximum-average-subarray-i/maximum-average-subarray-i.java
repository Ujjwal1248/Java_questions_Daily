class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        maxSum = currSum;
        int l = 0, r = k;
        while (r < nums.length) {
            currSum = currSum + nums[r] - nums[l];
            maxSum = Math.max(maxSum, currSum);
            l++;
            r++;
        }
        return (double) maxSum / k;
    }
}