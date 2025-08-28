class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0, l = 0, r = 0, zeros = 0;
        while (r < nums.length) {
            if (nums[r] == 0)
                zeros++;
            while (zeros > k) {
                if (nums[l] == 0)
                    zeros--;
                l++;
            }
            if (zeros <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
            }
            r++;
        }
        return maxLength;
    }
}