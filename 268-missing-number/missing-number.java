class Solution {
    public int missingNumber(int[] nums) {
        int xorr = 0;
        xorr ^= nums.length;
        for(int i = 0; i < nums.length; i++){
            xorr = xorr ^ i ^ nums[i];
        }
        return xorr;
    }
}