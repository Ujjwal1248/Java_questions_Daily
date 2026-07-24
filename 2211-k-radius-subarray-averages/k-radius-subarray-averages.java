class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        int window = 2 * k + 1;
        if (window > n)
            return ans;
        long sumK = 0;
        for (int i = 0; i < window; i++) {
            sumK += nums[i];
        }
        ans[k] = (int) (sumK / window);
        for (int i = window; i < n; i++) {
            sumK += nums[i];
            sumK -= nums[i - window];
            ans[i - k] = (int) (sumK / window);
        }
        return ans;
    }
}