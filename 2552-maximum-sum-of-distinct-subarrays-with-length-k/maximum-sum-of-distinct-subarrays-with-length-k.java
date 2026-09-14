class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0, n = nums.length;
        long currSum = 0, maxSum = 0;
        while (r < n) {
            if (!map.containsKey(nums[r])) {
                map.put(nums[r], r);
                currSum += nums[r];
                if (r - l + 1 == k) {
                    maxSum = Math.max(currSum, maxSum);
                    map.remove(nums[l]);
                    currSum -= nums[l++];
                }
                r++;
            } else {
                map.remove(nums[l]);
                currSum -= nums[l++];
            }
        }
        return maxSum;
    }
}