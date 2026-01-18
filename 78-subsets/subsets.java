class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp= new ArrayList<>();
        solve(nums, 0, temp);
        return ans;
    }
    public void solve(int[] nums, int idx, List<Integer> temp){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // for(int i = idx; i< nums.length; i++){
        // }
        temp.add(nums[idx]);
        solve(nums, idx + 1, temp);
        temp.remove(temp.size() - 1);
        solve(nums, idx + 1, temp);
    }
}