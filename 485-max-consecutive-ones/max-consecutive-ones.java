class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int left = 0;
        int right = 0;
        int maxCount = 0;
        int count = 0;
        while(right < nums.length){
            if(nums[right] == 1) count++;
            else count = 0;
            right++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}