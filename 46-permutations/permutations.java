class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        // boolean[] used = new boolean[nums.length];
        permutation(nums, 0);
        return ans;
    }

    public void permutation(int[] nums, int idx) {
        List<Integer> temp = new ArrayList<>();
        if (idx == nums.length) {
            for(int num : nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            // if(used[i]) continue;
            // used[i] = true;
            // temp.add(nums[i]);
            swap(nums, i, idx);
            permutation(nums, idx + 1);
            swap(nums, i, idx);
            // temp.remove(temp.size() - 1);
            // used[i] = false;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}