class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void helper(int[] nums, int sum, int idx, List<Integer> temp, List<List<Integer>> ans) {
        if (sum == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (sum < 0 || idx >= nums.length)
            return;

        temp.add(nums[idx]);
        helper(nums, sum - nums[idx], idx, temp, ans);
        temp.removeLast();
        helper(nums, sum, idx + 1, temp, ans);

    }
}