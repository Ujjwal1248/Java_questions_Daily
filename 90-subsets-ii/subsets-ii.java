class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums, int idx, List<Integer> temp){
        ans.add(new ArrayList<>(temp));

        for(int i = idx; i< nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            helper(nums,i+1, temp);
            temp.removeLast();
        }
    }
}