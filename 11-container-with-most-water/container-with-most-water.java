class Solution {
    public int maxArea(int[] nums) {
        int left = 0, right = nums.length - 1;
        int maxQ = 0;
        while (left < right) {
            int currQ = (right - left) * Math.min(nums[left], nums[right]);
            maxQ = Math.max(maxQ, currQ);
            if (nums[left] < nums[right]) left++;
            else right--;
        }
        return maxQ;
    }
}