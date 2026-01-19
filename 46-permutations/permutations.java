class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        permutation(nums, temp, used);
        return ans;
    }

    public void permutation(int[] nums, List<Integer> temp, boolean[] used){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            // swap(nums, i, idx);
            temp.add(nums[i]);
            permutation(nums, temp, used);
            temp.remove(temp.size() - 1);
            // swap(nums, i, idx);
            used[i] = false;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}