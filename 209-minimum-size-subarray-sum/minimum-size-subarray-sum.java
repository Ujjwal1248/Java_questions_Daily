class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minL = Integer.MAX_VALUE;
        int r = 0, l = 0, sum = 0;
        while(r < nums.length){
            sum += nums[r];
            while(sum >= target){
                minL = Math.min(minL, r-l+1);
                sum -= nums[l];
                l++;
            }
            // if(sum >= target){
            // }
            r++;
        }
        if(minL == Integer.MAX_VALUE) return 0;
        return minL;
    }
}