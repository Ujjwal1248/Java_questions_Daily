class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, n = nums.length;
        int minL = Integer.MAX_VALUE;
        int sum = 0;
        while(r < n){
            sum+=nums[r];
            while(sum >= target){ 
                minL = Math.min(minL, r-l+1);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return minL == Integer.MAX_VALUE ? 0 : minL;
    }
}