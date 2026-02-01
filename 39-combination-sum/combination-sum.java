class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        helper(candidates, target, 0, temp);
        return ans;
    }

    public void helper(int[] nums, int target, int idx, List<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || idx == nums.length)
            return;
        temp.add(nums[idx]);
        helper(nums, target - nums[idx], idx, temp); //(idx) because Same number can be used multiple times
        temp.removeLast();
        helper(nums, target, idx + 1, temp); //
    }
}