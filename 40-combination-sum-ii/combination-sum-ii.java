class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int[] nums, int sum, int idx, List<Integer> temp, List<List<Integer>> ans) {
        if (sum == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (sum < 0 || idx >= nums.length)
            return;

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > sum)
                break;
            temp.add(nums[i]);
            helper(nums, sum - nums[i], i + 1, temp, ans);
            temp.removeLast();
        }
    }
}