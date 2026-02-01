class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        helper(nums, 0, curr);
        return ans;
    }

    public void helper(int[] nums, int idx, List<Integer> curr) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums, idx + 1, curr);
        curr.removeLast();
        helper(nums, idx + 1, curr);
    }
}