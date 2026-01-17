class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count=  0;
        int p = 1;
        if(k<=1) return 0;
        while(j < nums.length){
            p *= nums[j];
            while(p >= k){
                p /= nums[i];
                i++;
            }
            count += j-i+1;
            j++;
        }
        return count;
    }
}