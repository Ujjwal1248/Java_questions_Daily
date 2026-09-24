class Solution {
    public int trap(int[] nums) {
        int leftMax = 0, rightMax = 0;
        int l = 0, r = nums.length - 1;
        int total = 0;
        while(l < r){
            leftMax = Math.max(leftMax, nums[l]);
            rightMax = Math.max(rightMax, nums[r]);

            if(leftMax < rightMax){
                total += leftMax - nums[l];
                l++;
            }
            else{
                total += rightMax - nums[r];
                r--;
            }
        }
        return total;
    }
}