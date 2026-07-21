class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(target - sum) < Math.abs(closest - target)) closest = sum;
                if (sum < target)
                    j++;
                else if (sum > target)
                    k--;
                else {
                    return sum;
                }
            }
        }
        return closest;
    }
}