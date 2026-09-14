class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums) total+=num;
        int leftS = 0;
        for(int i = 0; i < nums.length; leftS += nums[i++]){
            if(2 * leftS == total - nums[i]) return i;
        }
        return -1;
    }
}