class Solution {
    public int majorityElement(int[] nums) {
        int curr = nums[0];
        int count = 0;
        for(int num : nums){
            if(curr == num) count++;
            else count--;
            if(count == 0){
                curr = num;
                count = 1;
            }
        }
        return curr;
    }
}