class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxA = nums[0];
        int l = 0, r = k;
        int currA = 0;
        for(int i = 0; i < k; i++){
            currA += nums[i];
        }
        maxA = currA;
        while (r < nums.length) {
            currA = currA + nums[r] - nums[l];
            maxA = Math.max(currA, maxA);
            l++;
            r++;
        }
        return (double) maxA / k;
    }
}