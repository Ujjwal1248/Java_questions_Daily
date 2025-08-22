class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void generate(int idx, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        generate(idx + 1, nums, current, ans);
        current.remove(current.size() - 1);
        generate(idx + 1, nums, current, ans);

    }
}