class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0; i <= max; i++){
            if(max >= n-1) return true;
            max = Math.max(max, i + nums[i]);
        }
        return max >= n-1;
    }
}