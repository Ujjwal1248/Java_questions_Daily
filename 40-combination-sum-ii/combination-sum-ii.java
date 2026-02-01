class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, int target, int start, List<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(i>start && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            temp.add(nums[i]);
            backtrack(nums, target - nums[i], i+1, temp);
            temp.removeLast();
        }
    }
}