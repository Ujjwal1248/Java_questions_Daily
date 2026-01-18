class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp);
        return ans;
    }

    public void solve(int[] nums, int idx, List<Integer> temp) {
        // if (idx == nums.length) {
        ans.add(new ArrayList<>(temp));
        //     return;
        // }
        for(int i = idx; i < nums.length; i++){
            if(i>idx && nums[i] == nums[i-1])continue;
            temp.add(nums[i]);
            solve(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
            // solve(nums, i + 1, temp);
        }
    }
}