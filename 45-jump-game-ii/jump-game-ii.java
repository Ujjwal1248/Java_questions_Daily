class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0, jumps = 0;
        while(r < nums.length - 1){
            int farthest = 0;
            for(int i = l; i<=r;i++){
                farthest= Math.max(farthest, nums[i] + i);
            }
            l = r+1;
            jumps++;
            r = farthest;
        }
        return jumps;
    }
}