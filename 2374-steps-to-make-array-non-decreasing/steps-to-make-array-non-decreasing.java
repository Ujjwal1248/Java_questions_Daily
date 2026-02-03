class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            int count = 0;
            while (!st.isEmpty() && nums[i] > st.peek()[0]) {
                count=Math.max(count + 1, st.peek()[1]);
                st.pop();
            }
            max = Math.max(count, max);
            st.push(new int[] { nums[i], count });
        }
        return max;
    }
}