class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        solve(candidates, target, 0, temp);
        return ans;
    }
    public void solve(int[] nums, int target, int idx, List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            temp.add(nums[i]);
            solve(nums, target - nums[i], i+1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}