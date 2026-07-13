class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] rightM = new int[n];
        rightM[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightM[i] = Math.max(height[i], rightM[i+1]);
        }
        int[] leftM = new int[n];
        leftM[0] = height[0];
        for(int i = 1; i < n; i++){
            leftM[i] = Math.max(height[i], leftM[i-1]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += (Math.min(leftM[i], rightM[i]) - height[i]);
        }
        return ans;
    }
}