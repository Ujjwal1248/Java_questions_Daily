class Solution {
    public int candy(int[] nums) {
        int n = nums.length;
        int[] candy = new int[n];
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i-1]) candy[i] = candy[i-1] + 1;
        }
        for(int i = n-2; i >= 0; i--){
            if(nums[i] > nums[i+1]) candy[i] = Math.max(candy[i], candy[i+1] + 1);
        }
        int total = n;
        for(int c : candy) total += c;
        return total;
    }
}