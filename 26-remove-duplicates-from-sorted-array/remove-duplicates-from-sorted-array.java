class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, k = 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[k] = nums[j];
                k++;
            }
            i++;
            j++;
        }
        return k;
    }
}