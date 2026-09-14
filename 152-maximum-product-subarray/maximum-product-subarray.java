class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            int num = nums[i];
            max = Math.max(num, Math.max(num * max, num * min));
            min = Math.min(num, Math.min(num * temp, num * min));
            ans = Math.max(ans, max);
        }
        return ans;
    }
}