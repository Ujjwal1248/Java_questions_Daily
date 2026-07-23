class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int count = 0;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        if((double)currSum/k >= (double)threshold) count++;
        int l = 0, r = k;
        while (r < nums.length) {
            currSum = currSum + nums[r] - nums[l];
            if((double)currSum/k >= (double)threshold) count++;
            l++;
            r++;
        }
        return count;
    }
}