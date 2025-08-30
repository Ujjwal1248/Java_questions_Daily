class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return gual(nums, k) - gual(nums, k - 1);
    }

    public int gual(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        while (r < nums.length) {
            sum += nums[r] % 2;
            while (sum > goal) {
                sum -= (nums[l] % 2);
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}