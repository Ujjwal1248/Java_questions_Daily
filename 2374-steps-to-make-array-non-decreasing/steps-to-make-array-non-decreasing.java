class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> st = new Stack<>();
        int n = nums.length;
        int max= 0;
        for(int i = n-1; i >=0; i--){
            int count = 0;
            while(!st.isEmpty() && st.peek()[0] < nums[i]){
                count = Math.max(count + 1, st.peek()[1]);
                st.pop();
            }
            max = Math.max(count, max);
            st.push(new int[]{nums[i], count});
        }
        return max;
    }
}