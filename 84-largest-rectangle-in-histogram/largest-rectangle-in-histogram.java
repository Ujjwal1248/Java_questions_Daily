class Solution {
    public int largestRectangleArea(int[] nums) {
        int[] nse = nextSmaller(nums);
        int[] pse = prevSmaller(nums);
        int maxH = nums[0];
        for(int i = 0; i < nums.length; i++){
            int left = (i - (pse[i] + 1)) * nums[i];
            int right = (nse[i] - i) * nums[i];
            maxH = Math.max(maxH, left+right);
        }
        return maxH;
    }
    public int[] prevSmaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            res[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        return res;
    }

    public int[] nextSmaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            res[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        return res;
    }
}