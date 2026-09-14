class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;
        for(int num : nums){
            if(num == 1) currCount++;
            else{
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }
        maxCount = Math.max(maxCount, currCount);
        return maxCount;
    }
}