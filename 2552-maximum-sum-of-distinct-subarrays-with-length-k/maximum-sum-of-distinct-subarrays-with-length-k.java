class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        long maxSum = 0, sum = 0;
        while (r < nums.length) {
            if (map.containsKey(nums[r])) {
                map.remove(nums[l]);
                sum -= nums[l];
                l++;
            } else {
                map.put(nums[r], r);
                sum += nums[r];
                if (r - l + 1 == k) {
                    maxSum = Math.max(maxSum, sum);
                    sum -= nums[l];
                    map.remove(nums[l]);
                    l++;
                }
                r++;
            }
        }
        return maxSum;
    }
}