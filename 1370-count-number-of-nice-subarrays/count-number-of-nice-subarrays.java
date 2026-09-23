class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k-1);
    }
    public int helper(int[] nums, int k) {
        int odd = 0;
        int l = 0, r = 0, c= 0;
        int n = nums.length;
        if(k < 0) return 0;
        while(r < n){
            if(nums[r] % 2 == 1){
                odd++;
            }
            while(odd > k){
                if(nums[l] % 2 == 1) odd--;
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }

}