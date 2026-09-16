class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0, maxC = 0;
        int l = 0, r= 0;
        while(r<nums.length){
            if(nums[r] == 0) zeros++;
            if(zeros <= k){
                maxC = Math.max(maxC, r-l+1);
            }
            else{
                if(nums[l] == 0) zeros--;
                l++;
            }
            r++;
        }
        return maxC;
    }
}