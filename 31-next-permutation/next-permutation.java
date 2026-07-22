class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;
        int n = nums.length;
        for(int i = n-2; i >=0; i--){
            if(nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }
        if(idx1 == -1){
            reverse(nums, 0);
            return;
        }
        for(int i = n-1; i >= 0; i--){
            if(nums[i] > nums[idx1]){
                idx2 = i;
                break;
            }
        }
        if(idx2 == -1){
            reverse(nums, 0);
            return;
        }
        swap(nums, idx1, idx2);
        reverse(nums, idx1 + 1);
    }
    public void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    public void reverse(int[] nums, int s){
        int e = nums.length - 1;
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}