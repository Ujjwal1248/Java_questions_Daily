class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nse = nese(heights);
        int[] pse = pese(heights);
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int curr = nse[i] - pse[i] - 1;
            maxArea = Math.max(maxArea, curr * heights[i]);
        }
        return maxArea;
    }

    public int[] pese(int[] nums) {
        int[] pse = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty())
                pse[i] = -1;
            else
                pse[i] = st.peek();
            st.push(i);
        }
        return pse;
    }

    public int[] nese(int[] nums) {
        int[] nse = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length-1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty())
                nse[i] = nums.length;
            else
                nse[i] = st.peek();
            st.push(i);
        }
        return nse;
    }
}