class Solution {
    public void nextPermutation(int[] nums) {
        // Left <-- Right
        // 1.  num[i] > nums[i+1]
        // 2.  num[j] > num[i]
        // 3.  swap(num[i], num[j])
        // 4.  reverse(num, i+1, n-1)

        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i == -1){
            reverse(nums,0,n-1);
            return;
        }
        int j = n-1;
        while(j >=i && nums[i] >= nums[j]) j--;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        reverse(nums, i+ 1, n-1);
    }
    public void reverse(int[] nums, int i, int j) {
        while(i < j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}